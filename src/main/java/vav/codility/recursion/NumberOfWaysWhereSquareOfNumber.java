package vav.codility.recursion;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWaysWhereSquareOfNumber {

    public int numTriplets(int[] nums1, int[] nums2) {
        int count = cnt(nums1, nums2);
        count += cnt(nums2, nums1);
        return count;
    }

    private int cnt(int[] nums1, int[] nums2) {
        Map<Long, Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            long val = (long) Math.pow((double) nums1[i], (double)2);
            Integer fromMap = map.get(val);
            if (fromMap == null) {
                count += countTrip(val, nums2, map);
            } else {
                count += fromMap;
            }
        }
        return count;
    }

    private int countTrip(long val, int[] nums2, Map<Long, Integer> map) {
        int count = 0;
        for (int i=0; i<nums2.length; i++) {
            for (int j=i+1; j<nums2.length; j++) {
                  long prod = (long)nums2[i] * (long)nums2[j];
                if (val == prod) {
                    count++;
                }
            }
        }
        map.put(val, count);
        return count;
    }

}
