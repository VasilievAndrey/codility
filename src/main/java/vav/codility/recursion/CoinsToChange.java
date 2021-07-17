package vav.codility.recursion;

import vav.codility.arrays.strings.IntegerToRoman;

import java.util.Arrays;
import java.util.Collections;

public class CoinsToChange {
    private int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        findCoins(coins, amount, 0, 0);
        return min;
    }

    private void findCoins(int[] coins, int amount, int start, int coinsCount) {
        if (start > coins.length) {
            return;
        }
        int res = 0;
        for (int i = start; i < coins.length; i++) {
            if (coins[i] > amount) {
                break;
            }
            res = amount / coins[i];
            int remainder = amount % coins[i];
            if (remainder == 0) {
                min = Math.min(min, res + coinsCount);
            } else {
                findCoins(coins, remainder, i, res + coinsCount);
            }
        }
    }
}
