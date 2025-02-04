package vav.codility.interview;

public class CalculateTheSum {

    int sum[];
    public CalculateTheSum(int[] nums) {
        sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sum[right];
        } else {
            return sum[right] - sum[left -1];
        }
    }
}
