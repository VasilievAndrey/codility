package vav.codility.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumKnightMoves {

    int min;
    int[] dx = new int[]{2,2,-2,-2,1,1,-1,-1};
    int[] dy = new int[]{1,-1,1,-1,2,-2,2,-2};

    public int minKnightMoves(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[301][301];
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] n = q.poll();
                if (vis[n[0]][n[1]]) {
                    continue;
                }
                vis[n[0]][n[1]] = true;
                if (n[0] == Math.abs(x) && n[1] == Math.abs(y)) {
                    return min;
                }
                for (int j=0; j<8; j++) {
                    int xx = n[0] + dx[j];
                    int yy = n[1] + dy[j];
                    q.add(new int[]{Math.abs(xx), Math.abs(yy)});
                }
            }
            min++;
        }
        return min;
    }
}
