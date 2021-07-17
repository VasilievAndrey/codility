package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int len = pattern.length();
        int[] pat = new int[len];
        List<String> ans = new ArrayList<>();
        int val = 0;
        char[] chars = pattern.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.keySet().contains(chars[i])) {
                val++;
                pat[i] = val;
                map.put(chars[i], val);
            }  else {
                pat[i] = map.get(chars[i]);
            }
        }
        for (String word : words) {
            if (word.length() != len) {
                continue;
            }
            if (isMatch(word, pat)) {
                ans.add(word);
            }
        }
        return ans;
    }

    private boolean isMatch(String word, int[] pat) {
        int val = 0;
        char[] chars = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < pat.length; i++) {
            if (!map.keySet().contains(chars[i])) {
                val++;
                if (val != pat[i]) {
                    return false;
                }
                map.put(chars[i], val);
            } else {
                if (map.get(chars[i]) != pat[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
