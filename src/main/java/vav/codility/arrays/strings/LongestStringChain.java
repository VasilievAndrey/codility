package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestStringChain {

    private int max = Integer.MIN_VALUE;

    public int longestStrChain(String[] words) {
        List<String>[] dic = new List[17];
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, 1);
            int len = w.length();
            if (dic[len] == null) {
                dic[len] = new ArrayList<>();
            }
            dic[len].add(w);
        }

        for (int i=16; i>=1; i--) {
            List<String> cur = dic[i];
            if (cur == null || cur.size() == 0) continue;
            for (String w: cur) {
                List<String> next = dic[i - 1];
                for (int j=0; j< w.length(); j++) {
                    max = Math.max(max, map.get(w));
                    if (next == null || next.size() == 0) continue;
                    StringBuilder bl = new StringBuilder(w);
                    bl.deleteCharAt(j);
                    String sub = bl.toString();
                    if (next.contains(sub)) {
                        Integer co = map.get(sub);
                        Integer co2 = map.get(w);
                        int res = Math.max(co2 +1, co);
                        map.put(sub, res);
                    }
                }
            }
        }
        return max;
    }

}
