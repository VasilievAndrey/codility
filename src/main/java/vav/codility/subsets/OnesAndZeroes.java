package vav.codility.subsets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class OnesAndZeroes {

    private Map<String, int[]> map = new HashMap<>();
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] DP = new int[m+1][n+1];
        for (String str: strs) {
            int[] count = count(str);
            for (int i=m; i >= count[0]; i--) {
                for (int j=n; j>= count[1]; j--) {
                    DP[i][j] = Math.max(DP[i][j], DP[i -count[0]][j -count[1]] + 1);
                }
            }
        }
        return DP[m][n];
    }

    private int[] count(String s) {
        int[] counts = map.get(s);
        if (counts != null) {
            return counts;
        }
        char[] chars = s.toCharArray();
        int zero =0;
        int ones = 0;
        for (char ch: chars) {
            if (ch == '0') {
                zero++;
            } else {
                ones++;
            }
        }
        counts = new int[]{zero, ones};
        map.put(s, counts);
        return counts;
    }
}
