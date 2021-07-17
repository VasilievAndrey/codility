package vav.codility.arrays2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        ans.add(cur);
        while (numRows -1 > 0) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            if (cur.size() >1) {
                for (int i=0; i<cur.size() -1; i++) {
                    next.add(cur.get(i) + cur.get(i+1));
                }
            }
            next.add(1);
            ans.add(next);
            cur = next;
            numRows--;
        }
        return ans;
    }
}
