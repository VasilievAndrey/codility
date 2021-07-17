package vav.codility.interview;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static int totalFruit(int[] tree) {

        if (tree == null || tree.length == 0) {
            return 0;
        }

        int mainPointer = 0;
        int minPointer = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(mainPointer < tree.length) {
            map.put(tree[mainPointer], mainPointer++);
            while (map.size() > 2) {
                int min = tree.length - 1;
                for (int index: map.values()) {
                    min = Math.min(min, index);
                }
                minPointer = min +1;
                map.remove(tree[min]);
            }
            result = Math.max(result, mainPointer - minPointer);
        }
        return result;
    }
}
