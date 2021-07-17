package vav.codility.arrays.strings;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = nums.length - 2;
        while (j >= 0 && nums[j + 1] <= nums[j]) {
            j--;
        }
        if (j >= 0) {
            int i = nums.length - 1;
            while (i >= 0 && nums[i] <= nums[j]) {
                i--;
            }
            swap(nums, j, i);
        }
        reverse(nums, j + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void reverse(int[] nums, int start) {
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
