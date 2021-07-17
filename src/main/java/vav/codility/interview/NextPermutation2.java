package vav.codility.interview;

import java.util.Arrays;

public class NextPermutation2 {

    public void nextPermutation(int[] nums) {
        if (nums.length <2) {
            return;
        }
        boolean act = false;
        for (int i=nums.length -2; i>=0; i--) {
            if (nums[i] > nums[i+1]) {
                swap(nums, i, i+1);
                 act = true;
                 break;
            }
        }
        if (act) {
            return;
        } else {
            Arrays.sort(nums);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
