package vav.codility.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static Double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0.0;
        }
        if (nums1.length > 0 && nums2.length > 0) {
            int[] merged = merge(nums1, nums2);
            return findMedian(merged);
        } else if (nums1.length == 0 && nums2.length > 0) {
            return findMedian(nums2);
        } else if (nums1.length > 0 && nums2.length == 0) {
            return findMedian(nums1);
        }
        return 0.0;
    }

    private static Double findMedian(int[] merged) {
        int index1 = merged.length / 2;
        if (merged.length % 2 == 0) {
            return (Double.valueOf(merged[index1 - 1]) + Double.valueOf(merged[index1])) / 2;
        } else {
            return Double.valueOf(merged[index1]);
        }
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return merge(nums2, nums1);
        }
        List<Integer> merged = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            while (j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    merged.add(nums2[j]);
                    j++;
                } else {
                    break;
                }
            }
            merged.add(nums1[i]);
        }

        if (nums2.length > 0 && j != nums2.length) {
            for (int i = j; i < nums2.length; i++) {
                merged.add(nums2[i]);
            }
        }
        return merged.stream().mapToInt(Integer::intValue).toArray();
    }
}
