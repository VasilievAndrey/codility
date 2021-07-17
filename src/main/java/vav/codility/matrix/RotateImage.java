package vav.codility.matrix;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i <=n / 2; i++) {
            for (int c = i; c <= n - i -1; c++) {
                int tmp = matrix[i][n - c];
                matrix[i][n - c] = matrix[c][i];
                matrix[c][i] = matrix[n - i][c];
                matrix[n - i][c] = matrix[n - c][n - i];
                matrix[n - c][n - i] = tmp;
            }
        }

    }
}
