package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanMakePalindromeFromSubstring {

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int[] cnt = new int[n +1];
        int i =0;
        for (char ch: s.toCharArray()) {
            cnt[i+1] = cnt[i++] ^ (1<<(ch -'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] q: queries) {
            int sum = (q[1] - q[0]) % 2;
            sum +=Integer.bitCount( cnt[q[1] +1] ^ cnt[q[0]]);
            res.add(sum /2 <= q[2]);
        }
        return res;
    }









/*
    int[] cnt = new int[s.length() + 1];
    int i = 0;
        for (char c : s.toCharArray()) {
        cnt[i + 1] = cnt[i] ^ (1 << (c - 'a'));
        i++;
    }
    List<Boolean> res = new ArrayList<>();
        for (int[] q : queries) {
        int sum = (q[1] - q[0]) % 2;
        sum += Integer.bitCount(cnt[q[1] + 1] ^ cnt[q[0]]);
        res.add(sum / 2 <= q[2]);  // if odd, just put it in center;
    }
        return res;

 */
}
