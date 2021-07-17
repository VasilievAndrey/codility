package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i= 0; i < intervals.length; i++) {
            if (isOverlap(prev, intervals[i])) {
                res.remove(prev);
                int[] merged = merge(intervals[i], prev);
                res.add(merged);
                prev = merged;
            } else {
                res.add(intervals[i]);
                prev = intervals[i];
            }
        }
        return res.toArray(new int[res.size()][2]);
    }

    private int[] merge(int[] interval, int[] newInterval) {
        return new int[] {Math.min(interval[0], newInterval[0]), Math.max(interval[1], newInterval[1])};
    }

    private boolean isOverlap(int[] interval, int[] newInterval) {
        return interval[0] <= newInterval[0] && interval[1] >= newInterval[0]||
                newInterval[0] <= interval[0] && newInterval[1] >= interval[0];
    }

}
