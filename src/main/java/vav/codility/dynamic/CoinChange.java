package vav.codility.dynamic;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        return findCoins(coins, amount, dp);
    }

    private static int findCoins(int[] coins, int amount, int[] dp) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (dp[amount] != 0) return dp[amount];
        int min = Integer.MAX_VALUE;
        for (int c : coins) {
            if (c > amount) {
                continue;
            }
            int res = findCoins(coins, amount - c, dp);
            if (res >= 0 && res < min) {
                min = res + 1;
            }
        }
        dp[amount] = min == Integer.MAX_VALUE ? -1 : min;

        return dp[amount];
    }
}
