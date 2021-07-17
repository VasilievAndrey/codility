package vav.codility.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class NumberOfRestrictedPathsFromFirstToLastNode {

    public int countRestrictedPaths(int n, int[][] edges) {
        int[] edg = new int[n];
        List<int[]>[] graph = createGraph(n, edges);
        int[] dist = dijkstra(n, graph);
        int[] vis = new int[n + 1];
        long response = dfs(1, graph, dist[1], vis, dist, n, new HashMap<>());
        return (int) (response % 1000000007);
    }

    private long dfs(int node, List<int[]>[] graph, int maxDistance, int[] vis, int[] dist, int n, HashMap<Integer, Long> map) {
        if (node == n) {
            return 1;
        }
        if (map.get(node) != null) {
            return map.get(node);
        }
        long res = 0;
        vis[node] = 1;
        for (int[] neighbor : graph[node]) {
            if (vis[neighbor[0]] == 1) {
                continue;
            }
            if (dist[neighbor[0]] < maxDistance) {
                res += (dfs(neighbor[0], graph, neighbor[1], vis, dist, n, map) % 1000000007);
            }
        }
        map.put(node, res);
        vis[node] = 0;
        return res;
    }


    private int[] dijkstra(int n, List<int[]>[] graph) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = 0;
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        Q.offer(new int[]{0, n});
        while (!Q.isEmpty()) {
            int[] node = Q.poll();
            for (int[] neighbor : graph[node[0]]) {
                int v = neighbor[0];
                if (v == n) continue;
                int d = neighbor[1] + node[1];
                if (d < dist[v]) {
                    dist[v] = d;
                    Q.offer(new int[]{v, d});
                }
            }

        }
        return dist;
    }

    private List<int[]>[] createGraph(int n, int[][] edges) {
        List<int[]>[] graph = new List[n + 1];
        for (int[] ed : edges) {
            if (graph[ed[0]] == null) {
                graph[ed[0]] = new ArrayList<>();
            }
            if (graph[ed[1]] == null) {
                graph[ed[1]] = new ArrayList<>();
            }
            graph[ed[0]].add(new int[]{ed[1], ed[2]});
            graph[ed[1]].add(new int[]{ed[0], ed[2]});
        }
        return graph;
    }
}
