package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;
        Set<Integer> set = Arrays.stream(candyType).boxed().collect(toSet());
        return Math.min(n, set.size());
    }
}
