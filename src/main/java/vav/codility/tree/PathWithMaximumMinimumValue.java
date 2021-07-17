package vav.codility.tree;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMaximumMinimumValue {

    int[][] dir = new int[][] {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int maximumMinimumPath(int[][] mt) {
        int row = mt.length;
        int col = mt[0].length;
        if(row == 0){
            return -1;
        }
        int[][] dist = new int[row][col];
        for(int[]dis :  dist){
            Arrays.fill(dis,Integer.MIN_VALUE);
        }
        PriorityQueue<Path> pq = new PriorityQueue<>();
        pq.add(new Path(0,0, mt[0][0]));
        while(!pq.isEmpty()) {
            Path cell = pq.poll();
            if (cell.i == row -1 && cell.j == col -1) {
                return cell.smallest;
            }
            for (int[] dr: dir) {
                int x = cell.i + dr[0];
                int y = cell.j + dr[1];
                if (x >=0 && x < row && y>=0 && y<col) {
                    int cur = Math.min(cell.smallest, mt[x][y]);
                    if(cur > dist[x][y]){
                        dist[x][y] = cur;
                        pq.add(new Path(x, y,cur));
                    }
                }
            }

        }
        return -1;
    }

    public class Path implements Comparable<Path>{
        int i,j,smallest;

        public Path(int i, int j, int smallest){
            this.i = i;
            this.j = j;
            this.smallest = smallest;
        }

        public int compareTo(Path other){
            return other.smallest - this.smallest;
        }
    }

}
