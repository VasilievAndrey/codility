package vav.codility.arrays.strings;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LargestTrippleProduct {

    int[] findMaxProduct(int[] arr) {
        // Write your code here
        Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int[] ans = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() < 3) {
                ans[i] = -1;
            } else {
                Queue<Integer> tmpQ = pq;
                ans[i] = tmpQ.poll() * tmpQ.poll() * tmpQ.poll();
            }
        }
        return ans;
    }

}
