package vav.codility.noidea;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class SurroundedRegions {

    private List<int[]> DIR = asList(new int[]{1,0}, new int[]{0,1}, new int[]{-1,0}, new int[]{0, -1} );

    public void solve(char[][] board) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i = 0; i<board.length; i++) {
            for (int j=0; j < board[0].length; j++) {
                if (board[i][j]== 'O') {
                   List<int[]> cells = isIsland(vis, board, i, j, new LinkedList<>());
                   if (cells.size() > 0) {
                       for (int[] cell: cells) {
                           board[cell[0]][cell[1]] = 'X';
                       }
                   }
                }
            }
        }
    }

    private List<int[]> isIsland(boolean[][] vis, char[][] board, int i, int j, List<int[]> res) {
        if (vis[i][j]== true) {
            return res;
        }

//        for () {
//
//        }
        return null;
    }
}
