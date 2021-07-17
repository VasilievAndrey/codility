package vav.codility.interview;

public class ProductAll {

    public int[] productExceptSelf(int[] nums) {
        int pr =1;
        int zeroInd = -1;
        int zeroCount = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroCount == 0) {
                    zeroCount++;
                } else {
                    return new int[nums.length];
                }
                zeroInd = i;
                continue;
            }
            pr *= nums[i];
        }
        int[] ans = new int[nums.length];
        if (zeroInd != -1) {
            ans[zeroInd] = pr;
            return ans;
        }
        for (int i=0; i<nums.length; i++) {
            ans[i] = pr / nums[i];
        }

        return ans;
    }
}
