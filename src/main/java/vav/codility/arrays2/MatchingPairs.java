package vav.codility.arrays2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingPairs {

    int matchingPairs(String s, String t) {
        // Write your code here
        Map<Character, List<Integer>> mapS = new HashMap();
        Map<Character, Integer> mapT = new HashMap();
        int count =0;
        char[] chs1 = s.toCharArray();
        char[] chs2 = t.toCharArray();
        for (int i=0; i<s.length(); i++) {
            if (chs1[i] == chs2[i]) {
                count++;
            } else {
                List<Integer> ls = mapS.getOrDefault(chs1[i], new ArrayList());
                ls.add(i);
                mapS.put(chs1[i], ls);
                mapT.put(chs2[i], i);
            }
        }
        boolean pass = false;
        for (Character key: mapS.keySet()) {
            if (mapT.keySet().contains(key)) {
                pass = true;
                List<Integer> indxs = mapS.get(key);
                for (int ind: indxs) {
                    for (Map.Entry<Character, Integer> ent: mapT.entrySet())
                    if (ent.getValue() == ind && mapS.get(ent.getKey()) != null) {
                        return count + 2;
                    }
                }
            }
        }

        if (count == s.length()) {
            return count -2;
        }
        if (pass) {
            return count +1;
        } else {
            return count;
        }

    }
}
