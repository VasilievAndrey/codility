package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>();
        int res = 0;
        for (int[] in : intervals) {
            if (pq.isEmpty()) {
                pq.add(in[1]);
            } else {
                if (in[0] >= pq.peek()) {
                    pq.poll();
                }
                pq.add(in[1]);
                res = Math.max(res, pq.size());
            }
        }
        return res;
    }

}
