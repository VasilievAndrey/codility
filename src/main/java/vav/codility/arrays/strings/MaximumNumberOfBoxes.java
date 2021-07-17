package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumNumberOfBoxes {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] -a[1]);
        int ans = 0;
        for (int i=0; i<boxTypes.length; i++) {
            while (truckSize > 0 && boxTypes[i][0] >0) {
                truckSize--;
                ans +=boxTypes[i][1];
                boxTypes[i][0]--;
            }
        }
        return ans;
    }
}
