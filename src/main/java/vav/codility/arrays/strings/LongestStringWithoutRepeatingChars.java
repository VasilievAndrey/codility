package vav.codility.arrays.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> substr = new HashSet<>();
        while (left < chars.length) {
            substr.add(chars[left]);
            if (left >= right) {
                right = left +1;
            }
            while (right < chars.length && !substr.contains(chars[right])) {
                substr.add(chars[right++]);
            }
            max = Math.max(max, substr.size());
            substr.remove(chars[left]);
            left++;
        }
        return max;
    }
}
