package vav.codility.arrays.strings;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
