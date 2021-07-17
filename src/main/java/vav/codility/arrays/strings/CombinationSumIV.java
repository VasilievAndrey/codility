package vav.codility.arrays.strings;

import java.util.Arrays;

public class CombinationSumIV {


    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target +1];
        Arrays.fill(dp, -1);
        dp[0] =1;
        return find(nums, dp, target);
    }

    private int find(int[] nums, int[] dp, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] <= target) {
                count +=find(nums, dp,target - nums[i]);
            }
        }

        dp[target] = count;
        return count;
    }
}
