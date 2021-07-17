package vav.codility.arrays2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfSubarraysWithBoundedMaximum {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countBelowBoundary(nums, left)-countBelowBoundary(nums,right-1);
    }

    public int countBelowBoundary(int[] A, int bound){
        int count = 0;
        int tmp = 0;

        for(int a: A){
            if(a<=bound){
                tmp += 1;
                count += tmp;
            }else{
                tmp = 0;
            }
        }
        return count;
    }

    int maxCandies(int[] arr, int k) {
        // Write your code here
        Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (Integer n: arr) {
            pq.add(n);
        }
        int prev = 0;
        int ans = 0;
        while (k>0) {
            int cur = pq.poll();
            ans += cur;
            pq.add(cur/2);
        }
        return ans;

    }


}
