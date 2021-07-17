package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringContainsBinarySubstr {

    public boolean hasAllCodes(String s, int k) {
        List<String> tokens = toBinaryList(k);
        Map<String, Boolean> map = new HashMap<>();
        tokens.forEach(token -> map.put(token, false));
        int left = 0;
        int right = k;
        while (right <= s.length()) {
            String cur = s.substring(left, right);
            if (map.keySet().contains(cur)) {
                map.put(cur, true);
            }
            left +=1;
            right +=1;
        }
        return map.values().stream().allMatch(token -> token);
    }

    private List<String> toBinaryList(int k) {
        List<String> res = new ArrayList<>();
        int pow = Double.valueOf(Math.pow(2,k)).intValue() -1;
        for (int i = 0; i <= pow; i++) {
            res.add(toBinaryString(i, k));
        }
        return res;
    }

    private String toBinaryString(int k, int l) {
        String s = "";
        while (k > 0) {
            if (k % 2 == 1) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            k = k / 2;
        }
        while (s.length() < l) {
            s = "0" + s;
        }
        return s;
    }

}
