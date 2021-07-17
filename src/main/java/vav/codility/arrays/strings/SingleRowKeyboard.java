package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SingleRowKeyboard {

    public static int calculateTime(String keyboard, String word) {
        if (word.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = keyboard.toCharArray();
        for (Integer i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        char[] wordCh = word.toCharArray();
        int res = 0;
        int prev = 0;
        for (char ch:wordCh) {
            int cur = map.get(ch);
            res = res + Math.abs(cur - prev);
            prev = cur;
        }
        return res;
    }
}
