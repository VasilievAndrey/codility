package vav.codility.arrays2;

public class RangeSumQuery {

    private int[] nums;
    private int[] sums;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
        this.sums = new int[nums.length];
        this.sums[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            this.sums[i] = sums[i-1] + nums[i];
        }
    }

    public void update(int index, int val) {
        int next = val - nums[index];
        for (int i=index; i<sums.length; i++) {
            this.sums[i] = this.sums[i] + next;
        }
        this.nums[index] = val;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return this.sums[right];
        } else {
            return this.sums[right] - this.sums[left - 1];
        }
    }
}
