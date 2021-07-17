package vav.codility.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CriticalConnectionsInNetwork {

    private int[] low;
    private int[] disc;
    private int id = -1;
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> con) {
        Map<Integer, List<Integer>> gr = new HashMap<>();
        for (List<Integer> c : con) {
            List<Integer> orDefault = gr.getOrDefault(c.get(0), new LinkedList<>());
            orDefault.add(c.get(1));
            gr.put(c.get(0), orDefault);
            orDefault = gr.getOrDefault(c.get(1), new LinkedList<>());
            orDefault.add(c.get(0));
            gr.put(c.get(1), orDefault);
        }
        low = new int[n];
        disc = new int[n];
        Arrays.fill(disc, -1);
        dfs(0, -1, gr);
        return ans;
    }

    private void dfs(int at, int prev, Map<Integer, List<Integer>> gr) {
        low[at] = ++id;
        disc[at] = id;
        List<Integer> edgs = gr.get(at);
        if (edgs != null) {
            for (int to : edgs) {
                if (to == prev) continue;
                if (disc[to] == -1) {
                    dfs(to, at, gr);
                }
                low[at] = Math.min(low[to], low[at]);
                if (disc[at] < low[to]) ans.add(Arrays.asList(at, to));
            }
        }
    }

}
