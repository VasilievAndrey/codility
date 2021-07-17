package vav.codility.graph;

import java.util.Arrays;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[2001];
        for (int i = 0; i < parent.length; i++) parent[i] = i;

        for (int[] edge: edges){
            int a = edge[0], b = edge[1];
            int parentA = find(parent, a);
            int parentB = find(parent, b);
            if (parentA == parentB) return edge;
            else parent[parentA] = parentB;
        }

        return new int[2];
    }

    private int find(int[] parent, int f) {
        if (f != parent[f]) {
            parent[f] = find(parent, parent[f]);
        }
        return parent[f];
    }
}
