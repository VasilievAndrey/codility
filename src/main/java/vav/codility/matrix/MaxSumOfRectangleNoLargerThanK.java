package vav.codility.matrix;

public class MaxSumOfRectangleNoLargerThanK {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (matrix == null || n == 0 || m == 0) {
            return 0;
        }
        int[][] area = new int[n][m];
        for (int i=0; i<n; i++) {
            area[i][0] = matrix[i][0];
            for (int j=0; j<m; j++) {
                area[i][j] = matrix[i][j];
                if (i -1 >= 0) {
                    area[i][j] += area[i-1][j];
                }
                if (j-1 >=0) {
                    area[i][j] += area[i][j-1];
                }
                if (i> 0 && j>0) {
                    area[i][j] -= area[i-1][j-1];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int x=0; x<n -1; x++) {
            for (int x2=x+1; x2<n; x2++) {
                for (int y=0; y<m -1; y++) {
                    for (int y2=0; y2<m; y2++) {
                        int ar = area[x2][y2];
                        if (x>0) {
                            ar -=area[x -1][y2];
                        }
                        if (y>0) {
                            ar -= area[x2][y-1];
                        }
                        if (x>0 && y>0) {
                            ar +=area[x-1][y-1];
                        }
                            if (ar <=k) {
                                max = Math.max(max, ar);
                            }
                    }
                }
            }
        }
        return max;
    }
}
