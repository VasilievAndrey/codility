package vav.codility.dynamic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        if (set.contains(s)) {
            return true;
        }
        for (int i = 1; i<s.length(); i++) {
            if (dsf(s, 0, i, set)){
                return true;
            }
        }
        return false;
    }

    private boolean dsf(String s, int st, int end, Set<String> set) {
        String sub = s.substring(st, end);
        if (set.contains(sub)) {
            if (end == s.length()) {
                return true;
            }
            for (int i = end+1; i <= s.length(); i++) {
                if (dsf(s, end, i, set)) {
                    return true;
                }
            }
        }
        return false;
    }
}
