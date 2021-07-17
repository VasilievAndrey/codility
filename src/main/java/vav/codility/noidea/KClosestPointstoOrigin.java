package vav.codility.noidea;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointstoOrigin {

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, k);
    }
}
