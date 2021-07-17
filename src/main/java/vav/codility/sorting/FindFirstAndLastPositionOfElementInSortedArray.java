package vav.codility.sorting;

import java.util.HashMap;
import java.util.Map;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int indx = nums.length /2;
        int[] ans = new int[2];
        int[] err = new int[] {-1,-1};
        if (nums.length == 0) {
            return err;
        }
        if (nums.length == 1 && target == nums[0]) {
            return new int[]{0,0};
        } else if (nums.length == 1) {
            return err;
        }
        if (target > nums[nums.length -1] || target < nums[0]) {
            return err;
        }
        int[] bf = new int[nums.length +1];
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            indx = (start + end) /2;
            if (nums[indx]== target) {
                break;
            }
            if (nums[indx] > target) {
                end =  indx -1;
            } else {
                start = indx +1;
            }
            if (bf[indx] == 0) {
                bf[indx] = 1;
            } else {
                return err;
            }
        }
        if (nums[indx] !=target) {
            return err;
        }
        if (start == end) {
            return new int[]{start, end};
        }
        int left = indx;
        while(nums[left] == target) {
            left--;
            if (left <0) {
                break;
            }
        }
        ans[0] = left +1;
        int right = indx;
        while(nums[right] == target) {
            right++;
            if (right ==nums.length) {
                break;
            }
        }
        ans[1] = right -1;
        return ans;
    }
}
