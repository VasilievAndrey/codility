package vav.codility.arrays.strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumUnitsInATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for (int[] b: boxTypes) {
            pq.add(b);
        }
        while (!pq.isEmpty()) {
            int[] p = pq.poll();
            if (p[0] <= truckSize) {
                truckSize -=p[0];
                count += p[0]*p[1];
            } else {
                while (truckSize>0) {
                    count +=p[1];
                    truckSize--;
                }
                break;
            }
        }
        return count;
    }
}
