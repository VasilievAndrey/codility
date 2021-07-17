package vav.codility.graph;

import java.util.HashMap;

public class CheapestFlightsWithinKStops {

    private HashMap<String, Long> memo;


    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int stops) {
        memo = new HashMap<>();

        int[][] mtrx = new int[n][n];
        for (int[] fl: flights) {
            mtrx[fl[0]][fl[1]] = fl[2];
        }

        int ans = (int) find(src, dst, mtrx, stops, n);
        return ans >= Integer.MAX_VALUE ? -1: ans;
    }

    private long find(int node, int dst, int[][] mtrx, int stops, int n) {
        if (node == dst) {
            return 0;
        }

        if (stops <0) {
            return Integer.MAX_VALUE;
        }
        String key = node + "_" + stops;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        long min = Integer.MAX_VALUE;
        for (int nei =0; nei < n; nei ++) {
            int cost = mtrx[node][nei];
            if (cost > 0) {
                min = Math.min(min, find(nei, dst, mtrx, stops -1, n) + cost);
            }
        }
        memo.put(key, min);
        return min;
    }

}
