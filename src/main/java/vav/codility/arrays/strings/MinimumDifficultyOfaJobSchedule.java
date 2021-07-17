package vav.codility.arrays.strings;

public class MinimumDifficultyOfaJobSchedule {

    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        int[][] dp = new int[d][n + 1];
        if(n < d) return -1;
        dp[0][0] = jobDifficulty[0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], jobDifficulty[i]);
        }
        for (int i = 1; i < d; i++) {
            for (int j = i; j <n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                int currMax = 0;
                for (int k = j; k >=i; k--) {
                    currMax = Math.max(currMax, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][k-1] + currMax);
                }
            }
        }
        return dp[d-1][n-1];
    }
}
