package vav.codility.tree.binary.indexed;

public class RangeSumQuery2DMutable {

    int[][] mtrx;
    int[][] bf;
    int len;

    public RangeSumQuery2DMutable(int[][] matrix) {
        this.mtrx = matrix;
        double ln = Math.sqrt(matrix[0].length);
        this.len = (int) Math.ceil(matrix[0].length / ln);
        bf = new int[matrix.length][this.len];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int ind = j / this.len;
                bf[i][ind] = bf[i][ind] + matrix[i][j];
            }
        }
    }

    public void update(int row, int col, int val) {
        bf[row][col / len] = bf[row][col / len] - mtrx[row][col] + val;
        mtrx[row][col] = val;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for (int i = row1; i <= row2; i++) {
            int sum = 0;
            int left = col1 / len;
            int right = col2 / len;
            if (left == right) {
                for (int k = col1; k <= col2; k++) {
                    sum += mtrx[i][k];
                }
            } else {
                for (int k = col1; k <= (left + 1) * len - 1; k++) {
                    sum += mtrx[i][k];
                }
                for (int k = left + 1; k <= right - 1; k++) {
                    sum += bf[i][k];
                }
                for (int k = right * len; k <= col2; k++) {
                    sum += mtrx[i][k];
                }
            }
            ans += sum;
        }
        return ans;
    }
}
