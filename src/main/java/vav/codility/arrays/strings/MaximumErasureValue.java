package vav.codility.arrays.strings;

public class MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        short[] dp = new short[10001];
        int cur = 0;
        int max = 0;
        for (int left = 0, right = 0; right < nums.length; right++) {
            dp[nums[right]]++;
            cur += nums[right];
            while (dp[nums[right]] > 1) {
                dp[nums[left]]--;
                cur -= nums[left++];
            }
            max = Math.max(max, cur);
        }
        return max;
    }
}
