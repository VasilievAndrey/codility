package vav.codility.noidea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        char[][] desk = new char[n][n];
        for (int i=0; i<n; i++) {
            Arrays.fill(desk[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
                dfs(desk,0, i, ans);
        }
        return ans;
    }

    private void dfs(char[][] desk, int x, int y, List<List<String>> ans) {
        if (x == desk.length -1) {
            if (canPut(x,y, desk)) {
                desk[x][y] = 'Q';
                ans.add(buildRows(desk));
                desk[x][y] = '.';
            } else {
                return;
            }
        } else {
            if (!canPut(x,y,desk)) return;
            desk[x][y] = 'Q';
            for (int i=0; i<desk.length; i++) {
                dfs(desk, x+1, i, ans);
            }
            desk[x][y] = '.';
        }
    }

    private boolean canPut(int x, int y, char[][] desk) {
        int n = desk.length;
        //check col
        for (int k=x; k>=0; k--) {
            if (desk[k][y] == 'Q') {
                return false;
            }
        }
        //check diag
        for (int k = x,c = y;  k>=0 && c<n; k--, c++) {
            if (desk[k][c] == 'Q') {
                return false;
            }
        }
        //check anti diag
        for (int k = x, c =y; k>=0 && c>=0; k--, c--) {
            if (desk[k][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> buildRows(char[][] desk) {
        List<String> ans = new ArrayList<>();
        for (int i=0; i<desk.length; i++) {
            ans.add(new String(desk[i]));
        }
        return ans;
    }
}
