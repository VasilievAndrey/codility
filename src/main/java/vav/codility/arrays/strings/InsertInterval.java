package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval.length == 0) {
            return  intervals;
        }
        if (intervals.length == 0) {
            return new int[][] {newInterval};
        }
        List<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        boolean inserted = false;
        for (int i= 0; i < intervals.length; i++) {
            if (!inserted) {
                if (lessThan(intervals[i], newInterval)) {
                    res.add(newInterval);
                    res.add(intervals[i]);
                    inserted = true;
                }
                else if (idBetween(intervals[i], prev, newInterval)) {
                    res.add(newInterval);
                    res.add(intervals[i]);
                    inserted = true;
                } else if (isOverlap(intervals[i], newInterval)) {
                    int[] merged = merge(intervals[i], newInterval);
                    res.add(merged);
                    prev = merged;
                    inserted = true;
                } else {
                    res.add(intervals[i]);
                }
            } else if (isOverlap(prev,intervals[i])) {
                res.remove(prev);
                int[] merged = merge(intervals[i], prev);
                res.add(merged);
                prev = merged;
                inserted = true;
            } else {
                res.add(intervals[i]);
            }
        }
        if (!inserted) {
            res.add(newInterval);
        }

        return res.toArray(new int[res.size()][2]);
    }

    private boolean lessThan(int[] interval, int[] newInterval) {
        return newInterval[1] < interval[0];
    }

    private int[] merge(int[] interval, int[] newInterval) {
        return new int[] {Math.min(interval[0], newInterval[0]), Math.max(interval[1], newInterval[1])};
    }

    private boolean isOverlap(int[] interval, int[] newInterval) {
        return interval[0] <= newInterval[0] && interval[1] >= newInterval[0]||
                newInterval[0] <= interval[0] && newInterval[1] >= interval[0];
    }

    private boolean idBetween(int[] interval, int[] prev, int[] newInterval) {
        return prev[1] < newInterval[0] && newInterval[1] < interval[0];
    }
}
