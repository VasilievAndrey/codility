package vav.codility.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AllPathsFromSourceLeadToDestination {

    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        //form graph
        Map<Integer, List<Integer>> gr = new HashMap<>();
        for (int[] ed : edges) {
            gr.putIfAbsent(ed[0], new ArrayList<>());
            gr.get(ed[0]).add(ed[1]);
        }
        boolean[] vis = new boolean[n];
        if (gr.get(destination) != null) return false;
        vis[source] = true;
        return dfs(gr, vis, source, destination);
    }

    private boolean dfs(Map<Integer, List<Integer>> map, boolean[] vis, int source, int destination) {
        if (source == destination) return true;
        List<Integer> childs = map.get(source);
        if (childs == null) return false;
        for (Integer ch: childs) {
            if (vis[ch]) return false;
            vis[ch] = true;
            if (!dfs(map, vis, ch, destination)) return false;
            vis[ch] = false;
        }
        return true;
    }

}
