package vav.codility.dynamic;

import java.util.Arrays;

public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n+1][m+1];
        for (int i=0; i<n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[n-1][m-1] = grid[n-1][m-1];
        for (int i =m-2; i>=0; i--) {
            dp[n-1][i] = dp[n-1][i+1] + grid[n-1][i];
        }
        for (int i=n-2; i>=0; i--) {
            for (int j=m-1; j>=0; j--) {
                    dp[i][j] =grid[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}
