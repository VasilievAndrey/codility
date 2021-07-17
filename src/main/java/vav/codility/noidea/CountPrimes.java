package vav.codility.noidea;

public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] vis = new boolean[n+1];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (vis[i]) {
                continue;
            } else {
                count++;
                update(vis, i,n);
            }
        }
        return count;
    }

    private void update(boolean[] vis, int i, int n) {
        int pr =i;
        while (pr <= n){
            vis[pr] = true;
            pr +=i;
        }
    }
}
