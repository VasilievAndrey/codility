package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfSubStrings {

    public List<String> maxNumOfSubstrings(String s) {
        char[] chs = s.toCharArray();
        int[] left = new int[26];
        int[] right = new int[26];
        for (int i=0; i<chs.length; i++) {
            left[chs[i] - 'a'] = Math.min(left[chs[i] -'a'], i);
            right[chs[i] - 'a'] = Math.max(right[chs[i] -'a'], i);
        }
        List<String> res = new ArrayList<>();
        for (int i=0; i<chs.length; i++) {
            if (left[chs[i]-'a'] != i) {
                continue;
            }
            int r = findRight(i,left, right, chs);
            if (r == -1) {
                continue;
            }
            res.add(s.substring(i, r+1));
            i=r;
        }
        return res;
    }

    private int findRight(int i, int[] left, int[] right, char[] chs) {
        int r = right[chs[i] - 'a'];
        for (int j=i; j<=r; j++) {
            if (left[chs[j] - 'a'] < i) {
                return -1;
            }
            r = Math.max(r, right[chs[j] -'a']);
        }
        return r;
    }
}
