package vav.codility.arrays.strings;

public class FindFirstandLastPositionofElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1,-1};
        }
        if (nums.length ==1 && target == nums[0]) {
            return new int[]{0,0};
        } else if (nums.length ==1) {
            return new int[] {-1,-1};
        }
        int mid  = nums.length/2;
        int right = nums.length -1;
        int left = 0;
        while (left <=right && mid >=0 && mid < nums.length &&nums[mid] != target) {
            if (left > right) break;
            if (nums[mid] > target) {
                right = mid -1;
            } else {
                left =mid +1;
            }
            mid = left + (right - left) /2;
        }
        if (mid == nums.length || mid <0 || nums[mid] != target) {
            return new int[] {-1,-1};
        }
        while (mid>=0 &&nums[mid] == target) {
            mid--;
        }
        int start = mid+1;
        int end = start;
        while (end< nums.length && nums[end] == target) {
            end++;
        }
        return new int[] {start, end -1};
    }
}
