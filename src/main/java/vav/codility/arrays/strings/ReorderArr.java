package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReorderArr {

    public void wiggleSort(int[] nums) {

        if (nums.length < 1) {
            return;
        }
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        Queue<Integer> maxQueue = new PriorityQueue<>((a,b) -> b - a);
        Queue<Integer> minQueue = new PriorityQueue<>();
        for (int i =0; i < nums.length; i++) {
            addToMap(map, i, nums[i]);
            maxQueue.add(nums[i]);
            minQueue.add(nums[i]);
        }
        int prev = nums[0];
        for (int i = 1; i< nums.length; i++) {
            if (i % 2 == 0 && prev < nums[i]) {
                findNextAndSwap(map, maxQueue, nums, i -1);
            } else if (i % 2 == 1 && prev > nums[i]) {
                findNextAndSwap(map, minQueue, nums, i -1);
            }
            prev = nums[i];
        }
    }

    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

    private void findNextAndSwap(Map<Integer, Queue<Integer>> map, Queue<Integer> queue, int[] nums, int i) {
        while (!queue.isEmpty()) {
            Integer val = queue.poll();
            Integer indx = map.get(val).poll();
            if (indx > i) {
                addToMap(map, i, nums[indx]);
                addToMap(map, indx, nums[i]);
                swap(nums, indx, i);
                break;
            }
        }

    }

    private void addToMap(Map<Integer, Queue<Integer>> map, int i, int num) {
        Queue<Integer> integers = map.get(num);
        if (integers == null) {
            integers = new PriorityQueue<>();
        }
        integers.add(i);
        map.put(num, integers);
    }


}
