package vav.codility.arrays.strings;

import java.util.Arrays;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] vis = new int[cost.length];
        Arrays.fill(vis, -1);
        return Math.min(dsf(0, cost, vis), dsf(1, cost, vis));
    }

    private int dsf(int i, int[] cost, int[] vis) {
        if (i>= cost.length) {
            return 0;
        }
        if (vis[i] != -1) {
            return vis[i];
        }
        int ans = cost[i] + Math.min(dsf(i + 1, cost, vis), dsf(i + 2, cost, vis));
        vis[i] = ans;
        return ans;
    }
}
