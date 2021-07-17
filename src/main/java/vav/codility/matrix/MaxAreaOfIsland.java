package vav.codility.matrix;

public class MaxAreaOfIsland {

    int[][] dir = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
    int n;
    int m;
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int max = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                int res = travers(i, j, grid, vis);
                max =Math.max(res, max);
            }
        }
        return max;
    }

    private int travers(int i, int j, int[][] grid, boolean[][] vis) {
        if (vis[i][j]) {
            return 0;
        }
        vis[i][j] = true;
        if (grid[i][j]==0) {
            return 0;
        }
        int res = 1;
        for (int[] d: dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >=0 && x < n && y>=0 && y<m) {
                if (grid[x][y] == 1) {
                    res +=travers(x,y, grid, vis);
                }
            }
        }
        return res;
    }


}
