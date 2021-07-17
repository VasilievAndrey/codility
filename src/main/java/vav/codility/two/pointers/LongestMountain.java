package vav.codility.two.pointers;

public class LongestMountain {
    public static int longestMountain(int[] arr) {
        int previous = Integer.MIN_VALUE;
        int mountain = 0;
        int maxMountain = 0;
        boolean down = false;
        boolean up = false;
        boolean vertex = false;
        if (arr.length < 3) {
            return 0;
        }
        for (int val: arr) {
            if (mountain > 0 && val == previous) {
                if (vertex) {
                    maxMountain = Math.max(mountain, maxMountain);
                }
                up = false;
                down = false;
                vertex = false;
                mountain = 1;
            } else if (val > previous) {
                if (down == true) {
                    if (vertex) {
                        maxMountain = Math.max(mountain, maxMountain);
                        vertex = false;
                    }
                    mountain = 1;
                    down = false;
                }
                if (previous != Integer.MIN_VALUE) {
                    up = true;
                    down = false;
                }
                mountain++;
            } else if (val < previous && mountain > 0) {
                if (up) {
                    vertex = true;
                }
                down = true;
                up = false;
                if (vertex) {
                    mountain++;
                }
            }
            previous = val;
        }
        if (vertex) {
            maxMountain = Math.max(mountain, maxMountain);
        }
        return maxMountain;
    }
}
