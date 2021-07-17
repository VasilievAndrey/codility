package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSortdeArray {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int v: arr1) {
            map.put(v, 1);
        }
        for (int v: arr2) {
            Integer orDefault = map.get(v);
            if (orDefault == null) {
                continue;
            }
            orDefault++;
            map.put(v, orDefault);
        }
        for (int v: arr3) {
            Integer orDefault = map.get(v);
            if(orDefault == null) {
                continue;
            }
            orDefault++;
            map.put(v, orDefault);
        }
        List<Integer> ans = new LinkedList<>();
        map.entrySet().forEach(ent -> {if (ent.getValue() == 3) {
            ans.add(ent.getKey());
        }});
        return ans;
    }
}
