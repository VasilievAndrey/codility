package vav.codility.dynamic;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] dp = new int[w1.length+1][w2.length+1];

        for (int i=0; i<=w1.length; i++) {
            dp[i][0] = i;
        }
        for (int j=0; j<=w2.length; j++) {
            dp[0][j] = j;
        }
        for (int i=0; i<w1.length; i++) {
            for (int j=0; j<w2.length; j++) {
                if (w1[i] == w2[j]) {
                    dp[i+1][j+1] = dp[i][j];
                } else {
                    dp[i+1][j+1] = Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i][j]));
                    dp[i+1][j+1]++;
                }
            }
        }
        return dp[w1.length][w2.length];
    }
}
