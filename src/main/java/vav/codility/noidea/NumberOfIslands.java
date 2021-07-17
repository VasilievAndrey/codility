package vav.codility.noidea;

public class NumberOfIslands {

    int[][] DIR = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    count++;
                    findNeghbors(grid, i, j, visited);
                }
            }
        }
        return count;
    }

    private void findNeghbors(char[][] grid, int i, int j, boolean[][] visited) {
        if (i>= 0 &&i < grid.length && j >=0 && j < grid[0].length) {
            if (visited[i][j] == true) {
                return;
            }
            visited[i][j] = true;
            for (int[] dest : DIR) {
                int x = i + dest[0];
                int y = j + dest[1];
                if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
                    if (grid[x][y] == '0') {
                        visited[x][y] = true;
                    } else {
                        findNeghbors(grid, x, y, visited);
                    }
                }
            }
        }
    }
}
