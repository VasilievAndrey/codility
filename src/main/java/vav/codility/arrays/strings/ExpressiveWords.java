package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpressiveWords {

    public int expressiveWords(String s, String[] words) {
        if (s.length() == 0 || words == null || words.length == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        char prev = chars[0];
        for (int i=1; i<chars.length; i++) {
            if (prev == chars[i]) {
                if (count == 0) {
                    count =2;
                } else {
                    count++;
                }
                continue;
            }
            if (count > 2) {
                map.put(prev, count);
                count = 0;
            } else {
                count =0;
            }
            prev = chars[i];
        }
        if (count >2) {
            map.put(prev, count);
        }
        int ans =0;
        for (String word: words) {
            StringBuilder tmp = new StringBuilder();
            char[] chars2 = word.toCharArray();
            int ct =0;
            for (int j=0; j<chars2.length; j++) {
                Character ch = chars2[j];
                Integer c = map.get(ch);
                if (c != null) {
                    if (j<chars2.length -1 && ch == chars2[j+1]) {
                        tmp.append(ch);
                        if (ct == 0) ct = 1;
                        else ct++;
                        continue;
                    }
                    if (c -ct >= 3) {
                        for (int i = 0; i < c - ct; i++) {
                            tmp.append(ch);
                        }
                    }
                    ct =0;
                } else {
                    tmp.append(ch);
                }
            }
            if(ct > 0) {

            }
            if (tmp.toString().equals(s)) {
                ans++;
            }
        }
        return ans;
    }

    private class Desc {
        private int ind;
        private char ch;
        private int count;

        public Desc(int ind, char ch, int count) {
            this.ind = ind;
            this.ch = ch;
            this.count = count;
        }
    }
}
