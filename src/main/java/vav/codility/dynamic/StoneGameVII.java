package vav.codility.dynamic;

public class StoneGameVII {

    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] sums = new int[n];
        sums[0] = stones[0];
        for (int i=1; i<n; i++) {
            sums[i] =sums[i-1] + stones[i];
        }
        int[][] dp = new int[n][n];
        for (int start=n-2; start>=0; start--) {
            for (int end=start+1; end<n; end++) {
                dp[start][end] = Math.max(sumFrom(sums, start +1, end) - dp[start+1][end], sumFrom(sums, start, end -1) - dp[start][end -1]);
            }
        }
        return dp[0][n-1];
    }

    private int sumFrom(int[] sums, int start, int end) {
        return start == 0 ? sums[end]: sums[end] - sums[start -1];
    }
}
