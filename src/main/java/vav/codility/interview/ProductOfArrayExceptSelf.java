package vav.codility.interview;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int[] res = new int[nums.length];
        int[] prod = new int[nums.length];
        prod[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prod[i] = prod[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = nums.length -1 ; i >= 0; i--) {
            res[i] = prod[i] * right;
            right = right * nums[i];
        }
        return res;
    }
}
