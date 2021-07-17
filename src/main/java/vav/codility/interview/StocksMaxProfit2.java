package vav.codility.interview;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StocksMaxProfit2 {

    int max = 0;
    public int maxProfit(int[] prices) {
        Queue<Integer[]> q = new LinkedList<>();
        if (prices.length < 2) {
            return 0;
        }
        int maxProf = 0;
        int min = prices[0];
        int minInd = 0;
        int prev = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prev) {
                min = prices[i];
                minInd = i;
            } else {
                maxProf = prices[i] - min;
                if (!q.isEmpty() &&q.peek()[2] == i-1 && minInd == q.peek()[1]){
                    q.poll();
                }
                if (!q.isEmpty() && q.peek()[0] > prices[q.peek()[2]] - prices[i]) {
                    Integer[] poll = q.poll();
                    q.add(new Integer[]{prices[i] - prices[poll[1]], poll[1], i});
                } else {
                    q.add(new Integer[]{maxProf, minInd, i});
                }
            }
            prev = prices[i];
        }
        int k = 2;
        int ans = 0;
        while (!q.isEmpty()) {
        }
//        dsf(q, null, k, 0, prices);
        return ans;

    }

    private void dsf(Queue<Integer[]> q, Integer[] prev, int k, int sum, int[] prices) {
        if (q.isEmpty() || k == 0) {
            max = Math.max(max, sum);
            return;
        }
        Integer[] poll = q.poll();
        if (prev == null) {
            dsf(q, poll, k-1, sum + poll[0], prices);
        } else {
            dsf(q, poll, k-1, sum + poll[0], prices);
            if (prev[2] > poll[1]) {
                Integer[] merg = {prices[poll[2]] - prices[prev[1]], prev[1], poll[2]};
                q.add(merg);
                dsf(q, poll, k, sum - prev[0], prices);
            }
        }
    }
}
