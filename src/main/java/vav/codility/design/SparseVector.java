package vav.codility.design;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SparseVector {

    Map<Integer, Integer> map = new HashMap<>();

    SparseVector(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            map.put(i, nums[i]);
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int res = 0;
        for (Map.Entry<Integer, Integer> entry: vec.map.entrySet()) {
            Integer val = map.get(entry.getKey());
            if (val != null) {
                res +=val * entry.getValue();
            }
        }
        return res;
    }
}
