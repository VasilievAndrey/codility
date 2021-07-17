package vav.codility.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReduceArraySizeToTheHalf {
    Map<Integer, Integer> map = new HashMap<>();
    public int minSetSize(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        for (int num: arr) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, ++count);
            }
        }
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        map.keySet().forEach( key -> queue.add(new int[]{key, map.get(key)}));
        int count = 0;
        int res = 0;
        while (count < arr.length /2) {
            int[] poll = queue.poll();
            if (poll != null) {
                count += poll[1];
                res++;
            }
        }
        return res;
    }
}
