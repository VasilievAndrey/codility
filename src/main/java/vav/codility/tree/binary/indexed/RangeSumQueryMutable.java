package vav.codility.tree.binary.indexed;

public class RangeSumQueryMutable {

    private int[] nums;
    private int[] bf;
    private int len;

    public RangeSumQueryMutable(int[] nums) {
        this.nums = nums;
        double ln = Math.sqrt(nums.length);
        this.len = (int) Math.ceil(nums.length / ln);
        this.bf = new int[this.len];
        for (int i = 0; i < nums.length; i++) {
            bf[i / len] += nums[i];
        }
    }

    public void update(int index, int val) {
        bf[index / len] += val - nums[index];
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int start = left / len;
        int end = right / len;
        int sum = 0;
        if (start == end) {
            for (int i=left; i<=right; i++) {
                sum +=nums[i];
            }
        } else {
            for (int i=left; i<= ((start +1)* len) -1; i++) {
                sum +=nums[i];
            }
            for (int i=start +1; i<= (end -1); i++) {
                sum +=bf[i];
            }
            for (int i=end * len; i<=right; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
