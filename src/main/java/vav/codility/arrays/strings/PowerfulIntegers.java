package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> ans = new TreeSet<>();
        Map<String, Boolean> mem = new HashMap<>();
        int pow1 =0;
        int pow2 =0;
        int powSum =0;
        double prevPow1 = Integer.MAX_VALUE;
        double prevPow2 = Integer.MAX_VALUE;
        double curPow1 = Integer.MIN_VALUE;
        double curPow2 = Integer.MIN_VALUE;
        while (powSum <= bound && prevPow1 != curPow1) {
            pow2 =0;
            prevPow1 = curPow1;
            curPow1 = Math.pow(x, pow1);
            while (powSum <= bound && prevPow2 != curPow2) {
                prevPow2 = curPow2;
                curPow2 = Math.pow(y, pow2++);
                powSum = (int) (curPow1 + curPow2);
                if (powSum <= bound && mem.get(getKey(pow1, pow2)) == null) {
                    ans.add(powSum);
                    mem.put(getKey(pow1, pow2), true);
                } else {
                    break;
                }
            }
            prevPow2 = Integer.MIN_VALUE;
            pow1++;
            powSum = (int) (Math.pow(x, pow1) + Math.pow(y,0));
        }
        return new ArrayList<>(ans);
    }

    private String getKey(int x, int y) {
        return x + "_" + y;
    }
}
