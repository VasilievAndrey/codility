package vav.codility.arrays.strings;

import java.util.HashSet;
import java.util.Set;

public class Seats {
    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
        long ans = 0;
        for (int i=0; i<M; i++) {
            if (i== 0) {
                ans = S[i] / K;
                continue;
            } else if (i < M-1) {
                ans += (S[i] -S[i-1]) /K;
            } else if (i == M-1 && S[i] < N) {
                ans += (N - S[i]) /K;
            }

        }
        return ans;
    }
}
