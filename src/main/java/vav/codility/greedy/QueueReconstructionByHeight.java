package vav.codility.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        int[][] ans = new int[people.length][2];

        Queue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] != b[1]) {
                    return a[1] - b[1];
                } else {
                    return a[0] - b[0];
                }
            }
        });
        for (int[] val: people) {
            queue.add(val);
        }
        for (int i = 0; i < people.length; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }
}
