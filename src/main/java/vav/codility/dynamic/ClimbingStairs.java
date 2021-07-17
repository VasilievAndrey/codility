package vav.codility.dynamic;

import java.util.Arrays;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1);
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
