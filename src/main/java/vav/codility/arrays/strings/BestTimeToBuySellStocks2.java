package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BestTimeToBuySellStocks2 {

    public int maxProfit(int[] prices, int fee) {
        int res = 0;
        int prevMin = prices[0];
        Queue<int[]> intervals = new LinkedList<>();
        int prev = prices[0];
        for (int j =1; j < prices.length; j++) {
            int i = prices[j];
            if (i < prev) {
                int gain = calcGain(fee, prevMin, prev);
                if (gain > 0) {
                    intervals.add(new int[] {prevMin, prev});
                    prevMin = i;
                } else {
                    prevMin = Math.min(i, prevMin);
                }
            } else if (i> prev) {
                prevMin = Math.min(prev, prevMin);
                int gain = calcGain(fee, prevMin, i);
                if (j == prices.length -1 && gain >0) {
                    intervals.add(new int[] {prevMin, i});
                }
            }
            prev = i;
        }
        int[] prevSeg = null;
        List<int[]> out = new ArrayList<>();
        for (int[] seg: intervals) {
            if (prevSeg == null) {
                prevSeg = seg;
                out.add(seg);
            } else if (prevSeg[1] > seg[0] && prevSeg[1] < (seg[0] + fee)) {
                out.remove(prevSeg);
                out.add(new int[] {prevSeg[0], seg[1]});
            } else {
                out.add(seg);
            }
        }
        for (int[] a: out) {
            res += calcGain(fee, a[0], a[1]);
        }
        return res;
    }

    private int calcGain(int fee, int prevMin, int prevMax) {
        return prevMax - prevMin - fee;
    }
}
