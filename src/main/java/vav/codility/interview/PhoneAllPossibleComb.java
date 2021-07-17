package vav.codility.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneAllPossibleComb {
    private static final Map<Integer, List<String>> map = new HashMap<Integer, List<String>>() {{
        put(2, Arrays.asList("a", "b", "c"));
        put(3, Arrays.asList("d", "e", "f"));
        put(4, Arrays.asList("g", "h", "i"));
        put(5, Arrays.asList("j", "k", "l"));
        put(6, Arrays.asList("m", "n", "o"));
        put(7, Arrays.asList("p", "q", "r", "s"));
        put(8, Arrays.asList("t", "u", "v"));
        put(9, Arrays.asList("w", "x", "y", "z"));
    }};

    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        List<String> res = create(0, chars);
        return res;
    }

    private List<String> create(int i, char[] digits) {
        if (i == digits.length) {
            return new ArrayList<>();
        }
        List<String> strings = create(i + 1, digits);
        List<String> chars = map.get(digits[i] - '0');
        if (strings == null || strings.isEmpty()) {
            return chars;
        }
        List<String> res = new ArrayList<>();
        for (String tk: strings) {
            for (String ch:chars) {
                res.add(ch + tk);
            }
        }
        return res;
    }
}
