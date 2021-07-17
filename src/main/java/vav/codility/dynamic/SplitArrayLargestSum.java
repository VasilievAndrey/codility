package vav.codility.dynamic;

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        int min = Integer.MAX_VALUE;
     return 0;
    }

    private int find(int[] nums, int i, int m, int[] dp) {
        int sum = 0;
        if (m <0) {
            return 0;
        }
        if (dp[i] > 0) {
            return dp[i];
        }
        int min = Integer.MAX_VALUE;
        for (int j=i; j< nums.length -m; j++) {
            sum +=nums[j];
            int res = find(nums, j, m-1, dp);
            int max = Math.max(res, sum);
            min = Math.min(min, max);
        }
        dp[i] =min;
        return min;
    }
}
