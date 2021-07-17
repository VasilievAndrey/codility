package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || s.equals("") || t == null || t.equals("") || s.length() < t.length()) {
            return "";
        }
        if (s.length() == t.length() && s.contains(t)) {
            return s;
        }
        char[] chars = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            Integer count = map.getOrDefault(ch, 0);
            map.put(ch, ++count);
        }
        int right = 0;
        String min = "";
        int left = 0;
        while (right < s.length() && left < s.length() -t.length() +1) {
            String cur = s.substring(left, right +1);
            if (!map.keySet().contains(s.charAt(right))) {
                right++;
            } else if (!map.keySet().contains(s.charAt(left))) {
                left++;
            } else {
                if (allContains(cur, t, map)) {
                    if (min.equals("")) {
                        min = cur;
                    } else {
                        if (min.length() >= cur.length()) {
                            min = cur;
                        }
                    }
                    if (left >= right) {
                        right++;
                    } else {
                        left++;
                    }
                } else {
                    right++;
                }
            }
        }
        return min;
    }

    private static boolean allContains(String cur, String t, Map<Character, Integer> map) {
        Map<Character, Integer> copyMap = new HashMap<>(map);
        char[] chArr = cur.toCharArray();
        boolean valid = copyMap.keySet().contains(chArr[0]) && copyMap.keySet().contains(chArr[chArr.length -1]);
        if (!valid) {
            return false;
        }
        for (char ch : chArr) {
            if (copyMap.keySet().contains(ch)) {
                Integer count = copyMap.get(ch);
                copyMap.put(ch, --count);
            }
        }
        return copyMap.values().stream().allMatch(val -> val <=0);
    }
}
