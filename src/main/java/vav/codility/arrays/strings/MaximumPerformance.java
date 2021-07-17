package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumPerformance {
    private static final int MOD = 1_000_000_007;
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = speed[i];
            arr[i][1] = efficiency[i];
        }
        Arrays.sort(arr, (a,b) -> b[1] - a[1]);
        Queue<Integer> q = new PriorityQueue<>();
        long sum = 0;
        long ans = 0;
        for (int i=0; i<n; i++) {
            int sp = arr[i][0];
            q.add(sp);
            if (!q.isEmpty() && q.size() <=k) {
                sum += sp;
            } else {
                sum += sp - q.poll();
            }
            ans = Math.max(ans, sum * arr[i][1]);
        }
        return (int) ans  % MOD;
    }
}
