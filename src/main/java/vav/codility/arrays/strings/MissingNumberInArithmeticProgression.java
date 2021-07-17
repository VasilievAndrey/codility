package vav.codility.arrays.strings;

import java.util.Arrays;

public class MissingNumberInArithmeticProgression {

    public int missingNumber(int[] arr) {
        int dif = arr[1] - arr[0];
        if (dif < 0) {
            Arrays.sort(arr) ;
            return missingNumber(arr);
        }
        for (int i = 2; i<arr.length; i++) {
            int curr = arr[i] - arr[i-1];
            if(curr == dif) {
                continue;
            }
            if (curr > dif) {
                return arr[i-1] + dif;
            } else {
               return arr[0] + curr;
            }
        }
        return arr[0];
    }
}
