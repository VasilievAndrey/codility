package vav.codility.arrays.strings;

import java.util.Arrays;

public class MinimumMovesToEqualArray {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int midInd = nums.length / 2;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.abs(nums[i] - nums[midInd]);
        }
        long minCur = 0;
        for (int i = midInd; i >= 0; i--) {
            minCur = 0;
            for (int j = 0; j < nums.length; j++) {
                minCur += Math.abs(nums[i] - nums[j]);
            }
            if (minCur > ans) {
                break;
            } else {
                ans = minCur;
            }
        }
        for (int i = midInd; i<nums.length; i++) {
            minCur = 0;
            for (int j = 0; j < nums.length; j++) {
                minCur += Math.abs(nums[i] - nums[j]);
            }
            if (minCur > ans) {
                break;
            } else {
                ans = minCur;
            }
        }
        return (int)ans;
    }

}
