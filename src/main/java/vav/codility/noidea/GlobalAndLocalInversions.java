package vav.codility.noidea;

import java.util.Arrays;

public class GlobalAndLocalInversions {

    public boolean isIdealPermutation(int[] A) {
        int maxVal = -1;
        int n = A.length;
        for(int i = 0; i < n - 2; i++){
            maxVal = Math.max(A[i], maxVal);
            if(maxVal > A[i + 2])
                return false;
        }
        return true;
    }
}
