package vav.codility.interview;

public class SquareSubmatrix {

    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];
        int ans = 0;
        for (int i=1; i<n; i++) {
                dp[0][i] = matrix[0][i];
        }
        for (int i=1; i<m; i++) {
                dp[i][0] = matrix[i][0];
        }
        for (int i=1; i<m; i++) {
            for (int j=1; j<m; j++) {
                if (matrix[i][j] == 1)
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j-1], dp[i-1][j]));
                ans += dp[i][j];
            }
        }
        return ans;
    }
}
