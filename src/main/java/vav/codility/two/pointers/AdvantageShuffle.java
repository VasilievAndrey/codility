package vav.codility.two.pointers;

import java.util.Arrays;

public class AdvantageShuffle {
    int min = Integer.MAX_VALUE;
    int[] ans = null;

    public int[] advantageCount(int[] A, int[] B) {
        Integer[] tmp = new Integer[B.length];
        for (int i=0; i<B.length; i++) {
            tmp[i] = i;
        }
        Arrays.sort(tmp, (a, b) -> Integer.compare(B[b],B[a]));
        Arrays.sort(A);
        int[] ans = new int[A.length];
        int i =0;
        int j = B.length -1;
        for (int index: tmp) {
            ans[index] = A[j] > B[index] ? A[j--]: A[i++];
        }
        return ans;
    }




}
