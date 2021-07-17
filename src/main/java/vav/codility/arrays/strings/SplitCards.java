package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SplitCards {

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.values()) {
            ans = gcd(i, ans);
        }
        return ans > 1;
    }

    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
