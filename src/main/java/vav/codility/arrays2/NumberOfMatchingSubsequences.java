package vav.codility.arrays2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        Map<String, Boolean> vis = new HashMap<>();
        for (String w: words) {
            if (w.length() > s.length()) continue;
            if (vis.get(w) != null) {
                ans++;
                continue;
            }
            if (findMatch(s, w)) {
                vis.put(w, true);
                ans++;
            }
        }
        return ans;
    }

    private boolean findMatch(String s, String w) {
        int j = 0;
        for (int i = 0; i < s.length() && j < w.length(); i++) {
            if (s.charAt(i) == w.charAt(j)) {
                ++j;
            }
        }
        return j == w.length();    }
}
