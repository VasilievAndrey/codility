package vav.codility.noidea;

import java.util.Arrays;

public class MinimumNumberOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int numStation = stations.length;
        if (stations == null || numStation == 0 || stations[0].length == 0) {
            return target > startFuel ? -1 : 0;
        }
        int[][] dp = new int[numStation + 1][numStation + 1];
        Arrays.fill(dp[0], startFuel);
        if (startFuel >= target)
            return 0;
        for (int i = 1; i < numStation + 1; i++) {
            for (int j = 1; j < numStation + 1; j++) {
                if (dp[i - 1][j - 1] >= stations[j - 1][0])
                    dp[i][j] = dp[i - 1][j - 1] + stations[j - 1][1];
                if (dp[i][j] >= target)
                    return i;
                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
            }
        }
        return -1;
    }
}
