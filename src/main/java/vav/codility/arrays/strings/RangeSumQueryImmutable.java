package vav.codility.arrays.strings;

public class RangeSumQueryImmutable {

    private int[] bf;
    public RangeSumQueryImmutable(int[] nums) {
        this.bf = new int[nums.length];
        this.bf[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            this.bf[i] = this.bf[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return this.bf[right];
        }
        return this.bf[right] - this.bf[left -1];
    }
}
