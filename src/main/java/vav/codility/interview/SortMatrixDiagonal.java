package vav.codility.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortMatrixDiagonal {

    public int[][] diagonalSort(int[][] mat) {
        int col = mat[0].length;
        int row = mat.length;
        PriorityQueue<Integer> dg = new PriorityQueue<>();
        for (int i=0; i<col; i++) {
            int r = 0;
            for (int j = i; j < col; j++) {
                if (r == row) {
                    break;
                }
              dg.add(mat[r++][j]);
            }
            r = 0;
            for (int j = i; j < col; j++) {
                if (r == row) {
                    break;
                }
              mat[r++][j] = dg.poll();
            }
        }

        for (int i=1; i<row; i++) {
            int c = 0;
            for (int j = i; j < row; j++) {
                if (c == col) {
                    break;
                }
              dg.add(mat[j][c++]);
            }
            c = 0;
            for (int j = i; j < row; j++) {
                if (c == col) {
                    break;
                }
              mat[j][c++] = dg.poll();
            }
        }
        return mat;
    }
}
