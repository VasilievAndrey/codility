package vav.codility.arrays.strings;

public class Lock2 {

    public long getMinCodeEntryTime(int N, int M, int[] C) {
        // Write your code here
        int prev = 1;
        long ans = 0;
        for (int i=0; i<M; i++) {
            if (C[i] == prev) continue;
            ans += Math.min(Math.abs(C[i] -prev), Math.abs((N -C[i] +prev) % N));
            prev = C[i];
        }
        return ans;
    }
}
