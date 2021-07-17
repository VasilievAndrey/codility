package vav.codility.interview;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwo {
    List<int[]> arr;
    List<int[]> extended;

    MyCalendarTwo() {
        arr = new ArrayList();
        extended = new ArrayList();
    }

    public boolean book(int start, int end) {
        for (int[] in: extended) {
            if (in[0] < end && start < in[1]) return false;
        }
        for (int[] iv: arr) {
            if (iv[0] < end && start < iv[1])
                extended.add(new int[]{Math.max(start, iv[0]), Math.min(end, iv[1])});
        }
        arr.add(new int[]{start, end});
        return true;
    }
}
