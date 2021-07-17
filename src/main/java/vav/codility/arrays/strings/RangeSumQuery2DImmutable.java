package vav.codility.arrays.strings;

public class RangeSumQuery2DImmutable {

    int[][] buf;
    public RangeSumQuery2DImmutable(int[][] matrix) {
        this.buf = new int[matrix.length][matrix[0].length];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (j==0) {
                    buf[i][j] = matrix[i][j];
                } else {
                    buf[i][j] = buf[i][j-1] + matrix[i][j];
                }
            }

        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i=row1; i<=row2; i++) {
            if (col1 == 0) {
                sum +=buf[i][col2];
            } else {
                sum += buf[i][col2] - buf[i][col1 -1];
            }
        }
        return sum;
    }
}
