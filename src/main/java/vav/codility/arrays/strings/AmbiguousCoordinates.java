package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AmbiguousCoordinates {

    public List<String> ambiguousCoordinates(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        for (int i = 2; i < n - 1; ++i) {
            List<String> left = findAll(s.substring(1, i));
            List<String> right = findAll(s.substring(i, n-1));
            for (String a : left) {
                for (String b : right) {
                    res.add("(" + a + ", " + b + ")");
                }
            }
        }
        return res;
    }

    List<String> findAll(String s) {
        int n = s.length();
        char[] chs = s.toCharArray();
        if (n == 0 || (n > 1 && chs[0] == '0' && chs[n - 1] == '0')) return Collections.emptyList();
        if (n > 1 && chs[0] == '0') return Arrays.asList("0." + s.substring(1));
        if (chs[n - 1] == '0') return Arrays.asList(s);
        List<String> res = new ArrayList<>();
        res.add(s);
        for (int i = 1; i < n; ++i) {
            String token = s.substring(0, i) + "." + s.substring(i);
            res.add(token);
        }
        return res;
    }
}
