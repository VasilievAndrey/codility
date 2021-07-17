package vav.codility.booleanlogic;

import java.util.BitSet;

public class BulbSwitcherIV {

    private int min = Integer.MAX_VALUE;

    public int minFlips(String target) {
        char prev = '0';
        int res = 0;
        for (char c : target.toCharArray()) {
            if (c != prev) {
                prev = c;
                res++;
            }
        }
        return res;
    }

}
