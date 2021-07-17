package vav.codility.arrays.strings;

import java.util.Arrays;

public class JumpGame2 {

    public int jump(int[] nums) {
        int furthest = 0;
        int count = 0;
        int currentMaxJump = 0;
        for (int i =0; i <nums.length -1; i++) {
                furthest = Math.max(i + nums[i], furthest);
            if (i == currentMaxJump) {
                currentMaxJump = furthest;
                count++;
            }
        }
        return count;
    }
/*
    private int jumpFrom(int indx, int[] nums) {

    }
    */
}
