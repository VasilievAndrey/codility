package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class FindTheShortestSuperstring {

    public String dfs(String[] words) {
        Map<String, String> map = new HashMap<>();

        int state = 0;
        for (int i = 0; i < words.length; i++) {
            state |= 1 << i;
        }

        return dfs(words, "", state, map);
    }

    private String dfs(String[] words, String startWord, int unused, Map<String, String> map) {
        if (unused == 0) {
            return startWord;
        }

        // check
        String key = startWord + "|" + unused;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        String shortest = null;
        for (int i = 0; i < words.length; i++) {
            if (!(((unused >> i) & 1) == 0)) {
                String superstring = dfs(words, words[i], unused & ~(1 << i), map);

                String appended = overlapAppend(startWord, superstring);

                if (shortest == null || appended.length() < shortest.length()) {
                    shortest = appended;
                }
            }
        }
        map.put(key, shortest);
        return shortest;
    }


    private String overlapAppend(String a, String b) {
        for (int i = Math.max(1, a.length() - b.length()); i < a.length(); i++) {
            boolean match = true;
            for (int j = i; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j - i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return a.substring(0, i) + b;
            }
        }
        return a + b;
    }


}
