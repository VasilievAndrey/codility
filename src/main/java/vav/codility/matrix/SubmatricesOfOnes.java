package vav.codility.matrix;

public class SubmatricesOfOnes {

    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length, ans = 0;
        int[] h = new int[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) {
                    h[j]++;
                    int minHeight = h[j];
                    for(int k = j; k >= 0 && minHeight > 0; k--) {
                        minHeight = Math.min(h[k], minHeight);
                        ans += minHeight;
                    }
                }
                else {
                    h[j] = 0;
                }
            }
        }
        return ans;
    }

}
