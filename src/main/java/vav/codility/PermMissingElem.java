package vav.codility;

import java.util.Set;
import java.util.TreeSet;

public class PermMissingElem {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new TreeSet<Integer>();
        int len = A.length;
        for (int i = 0; i < len; i++) {
            set.add(A[i]);
        }
        int prev = 0;
        int cur = 1;
        for (Integer val: set) {
            cur = prev + 1;
            if (cur != val ) {
                break;
            } else {
                prev = val;
            }
        }
        return cur;
    }
}
