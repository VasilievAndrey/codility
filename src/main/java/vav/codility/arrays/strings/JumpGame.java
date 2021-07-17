package vav.codility.arrays.strings;

import java.util.Arrays;

public class JumpGame {

    enum Index {
        GOOD, BAD, UNKNOWN
    }

    public boolean canJump(int[] nums) {
        Index[] mem = new Index[nums.length];
        Arrays.fill(mem, Index.UNKNOWN);
        mem[nums.length -1] = Index.GOOD;
        for (int i= nums.length-2; i>=0; i--) {
            int futherst = Math.min(i+nums[i], nums.length -1);
            for (int j=i+1; j<= futherst; j++) {
                if (mem[j]==Index.GOOD) {
                    mem[i] = Index.GOOD;
                }
            }
        }
        return mem[0] == Index.GOOD;
    }
}
