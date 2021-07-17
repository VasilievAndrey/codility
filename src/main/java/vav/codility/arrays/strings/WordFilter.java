package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class WordFilter {
    Map<String, List<String>> sufmap = new HashMap<>();
    Map<String, List<String>> prefmap = new HashMap<>();
    Map<String, Integer> indMap = new HashMap<>();

    public WordFilter(String[] words) {

        for (int j=0; j<words.length; j++) {
            String word = words[j];
            Integer ind = indMap.get(word);
            if (ind != null) {
                indMap.put(word, j);
                continue;
            }
            indMap.put(word, j);

            for (int i=0; i<word.length(); i++) {
                String suf = word.substring(i);
                String pref = word.substring(0,i+1);
                List<String> up = sufmap.getOrDefault(suf, new ArrayList());
                up.add(word);
                sufmap.put(suf, up);
                List<String> prefixs = prefmap.getOrDefault(pref, new ArrayList());
                prefixs.add(word);
                prefmap.put(pref, prefixs);
            }
        }

    }

    public int f(String prefix, String suffix) {
        List<String> w1s = sufmap.get(suffix);
        List<String> w2s = prefmap.get(prefix);
        if (w1s == null || w2s == null) {
            return -1;
        }
        int max = -1;
        for (String w: w1s) {
            for (String w2: w2s) {
                if (w.equalsIgnoreCase(w2)) {
                    Integer ind = indMap.get(w);
                    if (ind!= null) {
                       max = Math.max(max, ind);
                   } else {
                        return -1;
                    }

                }
            }

        }
        return max;
    }
}
