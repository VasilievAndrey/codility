package vav.codility.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums1).forEach(
                val -> {
                    Integer count = map.get(val);
                    if (count == null) {
                        map.put(val, 1);
                    } else {
                        map.put(val, ++count);
                    }});
        List<Integer> res = new ArrayList<>();
        for(Integer i: nums2) {
            Integer count = map.get(i);
            if (count != null && count > 0) {
                count--;
                res.add(i);
                map.put(i, count);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
