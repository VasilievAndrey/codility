package vav.codility.arrays2;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        int size, j;
        double num;
        if (n == 0) {
            res.add(0);
            return res;
        }
        res.add(0);
        res.add(1);
        for (int i = 1; i < n; i++) {
            size = res.size();
            num = 1<<i;
            for (j = 0; j < size; j++) {
                res.add((int) num + res.get(size - j - 1));
            }
        }
        return res;
    }
}
