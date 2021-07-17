package vav.codility.interview;

import java.util.HashMap;
import java.util.Map;

public class GoodStrings {

    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch: chars.toCharArray()) {
            map.put(ch,map.getOrDefault(ch, 0) +1);
        }
        int ans = 0;
        for (String w: words) {
            Map<Character, Integer> tmp = new HashMap<>(map);
            boolean pass = true;
            for (Character ch: w.toCharArray()) {
                Integer count = tmp.get(ch);
                if (count == null || count <= 0) {
                    pass = false;
                    break;
                } else {
                    tmp.put(ch, count-1);
                }
            }
            if (pass) {
                ans +=w.length();
            }
        }
        return ans;
    }
}
