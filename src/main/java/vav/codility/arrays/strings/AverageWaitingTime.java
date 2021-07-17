package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.List;

public class AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        int length = customers.length;
        double wait = 0;
        int start = 0;
        for (int i = 0; i< length; i++) {
            start = Math.max(start, customers[i][0]);
            wait += customers[i][1] + start - customers[i][0];
            start += customers[i][1];
        }

        return wait / length;
    }
}
