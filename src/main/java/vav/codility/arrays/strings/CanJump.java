package vav.codility.arrays.strings;

import java.util.Arrays;

public class CanJump {
    enum Index {
        GOOD, BAD, UNKNOWN
    }

    public boolean canJump(int[] nums) {
        Index[] mem = new Index[nums.length];
        Arrays.fill(mem, Index.UNKNOWN);
        mem[nums.length -1] = Index.GOOD;
        for (int i=nums.length -2; i>=0; i--) {
            int furthest = Math.min(i + nums[i], nums.length -1);
            for (int j=i+1; j<= furthest; j++) {
                if (mem[j] == Index.GOOD) {
                    mem[i] = Index.GOOD;
                }
            }

        }
        return mem[0] == Index.GOOD;
    }

    private boolean canJumpFrom(int ind, int[] nums, Index[] mem) {
        if (ind == nums.length -1) {
            return true;
        }
        if (mem[ind] != Index.UNKNOWN) {
            return mem[ind] == Index.GOOD? true : false;
        }
        int position = nums[ind];
        int path = Math.min(ind + position, nums.length -1);
        for (int i= ind +1; i<=path; i++) {
           if (canJumpFrom(i, nums, mem)) {
               mem[i] = Index.GOOD;
                return true;
           }
        }
        mem[ind] = Index.BAD;
        return false;
    }
}
