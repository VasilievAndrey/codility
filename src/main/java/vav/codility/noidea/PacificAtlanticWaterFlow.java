package vav.codility.noidea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {

    private static final int[][] DIR = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private int numRows;
    private int numCols;

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        numRows = matrix.length;
        numCols = matrix[0].length;

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            pacificQueue.offer(new int[]{i, 0});
            atlanticQueue.offer(new int[]{i, numCols - 1});
        }
        for (int i = 0; i < numCols; i++) {
            pacificQueue.offer(new int[]{0, i});
            atlanticQueue.offer(new int[]{numRows - 1, i});
        }

        boolean[][] pacificRes = dfs(pacificQueue, matrix);
        boolean[][] atlanticRes = dfs(atlanticQueue, matrix);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            for (int j=0; j<numCols; j++) {
                if (pacificRes[i][j] && atlanticRes[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }

    private boolean[][] dfs(Queue<int[]> queue, int[][] matrix) {
        boolean[][] ans = new boolean[numRows][numCols];
        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            ans[cell[0]][cell[1]] = true;

            for (int[] dir: DIR) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if (x < 0 || x >= numRows || y < 0 || y >= numCols) {
                    continue;
                }
                if (ans[x][y]) {
                    continue;
                }

                if (matrix[x][y] <  matrix[cell[0]][cell[1]]) {
                    continue;
                }
                queue.add(new int[] {x,y});
            }

        }
        return ans;
    }
}
