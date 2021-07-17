package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestUniqueNumber {

    public int largestUniqueNumber(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        Integer[] sorted = IntStream.of(A).boxed().sorted((a, b) -> b - a).collect(Collectors.toList()).toArray(new Integer[A.length]);

        int ans = -1;
        int prev = sorted[0];
        int count = 1;
        for (int i =1; i<A.length; i++) {
            if (prev == sorted[i]) {
                count++;
                if (ans == sorted[i]) {
                    ans = -1;
                }
                continue;
            } else {
                if (ans != -1 && count <= 1) {
                    break;
                }
                if (count > 1) {
                    ans = sorted[i];
                } else {
                    ans = prev;
                    break;
                }
                count = 1;
            }
            prev = sorted[i];
        }
        return ans;
    }
}
