package vav.codility.arrays2;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedian {

    int[] findMedian(int[] arr) {
        // Write your code here
        int[] ans = new int[arr.length];
        if (arr == null || arr.length == 0) return null;

        Queue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
            int size = q.size();
            int mid = -1;
            int[] temp = new int[size];
            for (int j = 0; j < size; j++) {
                temp[j] = q.poll();
            }

            if (size % 2 == 0) {
                mid = size / 2 - 1;
                ans[i] = (temp[mid] + temp[mid + 1]) / 2;
            } else {
                mid = size / 2;
                ans[i] = temp[mid];
            }

            for (int j = 0; j < size; j++) {
                q.offer(temp[j]);
            }
        }
        return ans;
    }
}
