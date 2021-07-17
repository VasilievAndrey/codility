package vav.codility.dynamic;

public class LongestIncreasingPathinMatrix {
    private int[][] dir = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
    private int max = 0;
    public int longestIncreasingPath(int[][] matrix) {

        int[][] path = new int[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                max = Math.max(max, travers(i,j,matrix,path));
            }
        }
        return max;
    }

    private int travers(int i, int j, int[][] matrix, int[][] path) {
        int lenI = matrix.length;
        int lenJ = matrix[0].length;
        if (path[i][j] > 0) {
            return path[i][j];
        }
        int localMax = 1;
        for (int[] dr: dir) {
            int x = i + dr[0];
            int y = j + dr[1];
            if (x >= 0 && x < lenI && y >=0 && y<lenJ
                    && matrix[i][j] < matrix[x][y]) {
                localMax = Math.max(localMax, 1 + travers(x,y, matrix, path));
            }
        }
        path[i][j] =localMax;
        return path[i][j];
    }
}
