package vav.codility.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NumberOfConnectedComponents {

    public int countComponents(int n, int[][] edges) {
        boolean[] vis = new boolean[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        Arrays.sort(edges, (a, b) -> a[0] -b[0]);
        for (int[] ed: edges) {
            map.computeIfAbsent(ed[0], (k) -> new ArrayList<>()).add(ed[1]);
        }

        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int[] ed: edges) {
            if (!vis[ed[0]]) {
                vis[ed[0]] = true;
                count++;
            } else {
                continue;
            }
            q.add(ed[0]);
            q.add(ed[1]);
            while (!q.isEmpty()) {
                Integer p = q.poll();
                if (p == null) {
                    continue;
                }
                vis[p] = true;
                List<Integer> c = map.get(p);
                if (c != null) {
                    q.addAll(c);
                }
            }
        }
        return count;
    }

}
