package vav.codility.interview;

public class KnightStayOnBoard {
    int[][] dir = new int[][] {{2,1}, {2,-1}, {1,2}, {1,-2}, {-2,1}, {-2,-1}, {-1,2}, {-1,-2}};
    public double knightProbability(int n, int k, int row, int column) {
            double dp1[][][] = new double[n][n][k + 1];

            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dp1[i][j][0] = 1;

            for (int s = 1; s <= k; ++s) {
                for (int x = 0; x < n; ++x) {
                    for (int y = 0; y < n; ++y) {
                        double prob = 0.0;
                        for (int d[] : dir) {
                            int nx = x + d[0];
                            int ny = y + d[1];

                            if (isInside(nx, ny, n))
                                prob += dp1[nx][ny][s - 1] / 8.0;
                        }
                        dp1[x][y][s] = prob;
                    }
                }
            }
            return dp1[row][column][k];
    }


    private boolean isInside(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}
