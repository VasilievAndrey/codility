package vav.codility.dynamic;

public class PaintHouse {

    public int minCost(int[][] costs) {
        int[][] dp = new int[costs.length][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];
        for (int j=1; j<costs.length; j++) {
            for (int i = 0; i < 3; i++) {
                dp[j][i] = Math.min(costs[j][i] +dp[j-1][(i +1) % 3] ,
                        costs[j][i] + dp[j-1][(i+2)%3]);
            }
        }

        return Math.min(dp[costs.length -1][0], Math.min(dp[costs.length-1][1],dp[costs.length-1][2]));
    }

}
