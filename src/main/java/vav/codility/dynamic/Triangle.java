package vav.codility.dynamic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Triangle {

    Map<String, Integer> mem = new HashMap<>();

    public int minimumTotal(List<List<Integer>> triangle) {
        return dfs(0, 0, triangle);
    }

    private int dfs(int i, int j,List<List<Integer>> triangle) {
        Integer from = mem.get(i + "_" + j);
        if (i == triangle.size()) {
            return 0;
        }
        if (from !=null) {
            return from;
        }
        List<Integer> row = triangle.get(i);
        int an1 = row.get(j) + dfs(i + 1, j, triangle);
        int an2 = row.get(j) + dfs(i + 1, j + 1,  triangle);
        int ans = Math.min(an1, an2);

        mem.put(i+"_"+j, ans);
        return ans;
    }
}
