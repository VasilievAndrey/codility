package vav.codility.tree;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubmatricesThatSumToTarget {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int xlen = matrix[0].length, ylen = matrix.length, ans = 0;
        Map<Integer, Integer> res = new HashMap<>();
        for (int[] r : matrix)
            for (int j = 1; j < xlen; j++)
                r[j] += r[j-1];
        for (int j = 0; j < xlen; j++)
            for (int k = j; k < xlen; k++) {
                res.clear();
                res.put(0,1);
                int csum = 0;
                for (int i = 0; i < ylen; i++) {
                    csum += matrix[i][k] - (j > 0 ? matrix[i][j-1] : 0);
                    ans += res.getOrDefault(csum - target, 0);
                    res.put(csum, res.getOrDefault(csum, 0) + 1);
                }
            }
        return ans;

    }
}
