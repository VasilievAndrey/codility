package vav.codility.arrays.strings;

public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums) {
        int prev = nums[0];
        int change = 0;
        int prevChange = 0;
        int count = 1;
        for (int i=1; i< nums.length; i++) {
            if (prev < nums[i]) {
                change = 1;
            } else if (prev > nums[i]) {
                change = -1;
            }
            if (change != 0 && prevChange != change) {
                count++;
            }
            prevChange = change;
            prev = nums[i];
        }
        return count;
    }
}
