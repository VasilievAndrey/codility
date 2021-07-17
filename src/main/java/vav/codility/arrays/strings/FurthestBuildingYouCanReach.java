package vav.codility.arrays.strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class FurthestBuildingYouCanReach {


    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<heights.length -1; i++) {
            int dif = heights[i+1] - heights[i];
            if (dif < 0) {
                continue;
            }
            if (ladders>0) {
                ladders--;
                pq.add(dif);
            } else if (pq.size()>0 && dif > pq.peek()) {
                pq.add(dif);
                bricks -=pq.poll();
            } else {
                bricks -=dif;
            }
            if (bricks <0) {
                return i;
            }
        }
        return heights.length -1;
    }

}
