package vav.codility.dynamic;

public class CountVowelsPermutation {
    private static final int MOD = 1_000_000_007;

    public int countVowelPermutation(int n) {
        long[] aCount = new long[n];
        long[] eCount = new long[n];
        long[] iCount = new long[n];
        long[] oCount = new long[n];
        long[] uCount = new long[n];

        aCount[0] = 1l;
        eCount[0] = 1l;
        iCount[0] = 1l;
        oCount[0] = 1l;
        uCount[0] = 1l;

        for (int i = 1; i < n; i++) {
            aCount[i] = (eCount[i - 1] + iCount[i - 1] + uCount[i - 1]) % MOD;
            eCount[i] = (aCount[i - 1] + iCount[i - 1]) % MOD;
            iCount[i] = (eCount[i - 1] + oCount[i - 1]) % MOD;
            oCount[i] = (iCount[i - 1]) % MOD;
            uCount[i] = (iCount[i - 1] + oCount[i - 1]) % MOD;
        }

        return (int) (aCount[n - 1] + eCount[n - 1] + iCount[n - 1] + oCount[n - 1] + uCount[n - 1]) / MOD;
    }
}
