package vav.codility.arrays.strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Queue<Integer> pq = new PriorityQueue<>();
        for (int n: nums) {
            pq.add(n);
        }
        int res = 0;
        int prev = pq.poll();
        int c = 1;
        while (!pq.isEmpty()) {
            Integer poll = pq.poll();
            if (prev == poll) {
                continue;
            } else if (prev +1 == poll) {
                c++;
            } else {
                res = Math.max(res, c);
                c =1;
            }
            prev = poll;
        }
        res = Math.max(res, c);
        return res;
    }
}
