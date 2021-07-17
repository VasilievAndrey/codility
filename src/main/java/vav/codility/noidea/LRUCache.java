package vav.codility.noidea;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRUCache {

    private Map<Integer, int[]> cache = new HashMap<>();
    private Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        int[] val = cache.get(key);
        if (val == null) {
            return -1;
        }
        queue.remove(val);
        val[2]++;
        queue.add(val);
        return val[1];
    }

    public void put(int key, int value) {
        int[] val = {key, value, 0};
        if (cache.keySet().size() >= capacity) {
            int[] remove = queue.poll();
            cache.remove(remove[0]);
        }
        queue.add(val);
        cache.put(key, val);
    }

}
