package vav.codility.dsf;

import java.util.Arrays;

public class OutOfBoundaryPaths {

    private final static int[][] DIR = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[maxMove + 1][m][n];
        for(int k = 1; k <= maxMove; k++){
            for(int r = 0; r < m; r++){
                for(int c = 0; c < n; c++){
                    for(int d = 0; d < 4; d++){
                        int x = r + DIR[d][0];
                        int y = c + DIR[d][1];
                        if(x < 0 || x >= m || y < 0 || y >= n){
                            dp[k][r][c] += 1;
                        }else{
                            dp[k][r][c] = (dp[k][r][c] + dp[k - 1][x][y]) % 1000000007;
                        }
                    }
                }
            }
        }
        return dp[maxMove][startRow][startColumn];
    }


}
