package vav.codility.interview;

import java.util.HashSet;
import java.util.Set;

public class SwapToLetters {

    public boolean buddyStrings(String a, String b) {
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        if (chars.length != chars1.length) {
            return false;
        }
        Character ch = null;
        Character ch2 = null;
        int count = 0;
        if (a.equals(b)) {
            return hasDuplicates(a);
        }
        for (int i = 0; i < chars.length && i < chars1.length; i++) {
            if (chars[i] != chars1[i]) {
                if (count > 1 || (count == 0 && i == chars.length -1)) {
                    return false;
                }
                if (ch == null) {
                    ch = chars[i];
                    ch2 = chars1[i];
                } else if (chars1[i] != Character.valueOf(ch) || chars[i] != Character.valueOf(ch2)) {
                    return false;
                }
                count++;
            }
        }
        return count != 1;
    }

    private boolean hasDuplicates(String a) {
        char[] chars = a.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : chars) {
            if (set.contains(Character.valueOf(ch))) {
                return true;
            }
            set.add(ch);
        }
        return false;
    }
}
