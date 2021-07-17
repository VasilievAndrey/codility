package vav.codility.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreesWithFactors {

    public int numFactoredBinaryTrees(int[] arr) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int prod = arr[i] * arr[j];
                if (map.keySet().contains(prod)) {
                    map.get(prod).add(new int[]{arr[i], arr[j]});
                }
            }
        }
        int count = 0;
        for (Map.Entry<Integer, List<int[]>> ent : map.entrySet()) {
            List<int[]> nodes = ent.getValue();
            count += getCount(map, nodes);
            count++;
        }
        return count;
    }

    private int getCountFromArray(List<int[]> nodes) {
        int count = 0;
        for (int[] n: nodes) {
            if (n[0]==n[1]) {
                count++;
            } else {
                count +=2;
            }
        }
        return count;
    }

    private int countNext(Map<Integer, List<int[]>> map, List<int[]> nodes) {
        int count = 0;
        for (int[] node : nodes) {
            count += getCount(map, map.get(node[0]));
            count += getCount(map, map.get(node[1]));

        }
        return count;
    }

    private int getCount(Map<Integer, List<int[]>> map, List<int[]> ints1) {
        int count = 0;
        List<int[]> ints = ints1;
        if (ints.size() > 0) {
            count += getCountFromArray(ints) + countNext(map, ints);
        }
        return count;
    }

}
