package vav.codility.arrays.strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumCostToConnectSticks {

    public int connectSticks(int[] sticks) {
        int ans = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int n :sticks) {
            pq.add(n);
        }

        while (pq.size() != 1) {
            int sum = pq.poll() + pq.poll();
            ans +=sum;
            pq.add(sum);
        }
        return ans;
    }
}
