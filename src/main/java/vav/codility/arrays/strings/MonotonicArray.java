package vav.codility.arrays.strings;

public class MonotonicArray {

    public boolean isMonotonic(int[] A) {
        if (A.length < 2) {
            return true;
        }
        int prev = A[0];
        int dir = 0;
        for (int i = 1; i < A.length; i++) {
            if (prev == A[i]) {
                continue;
            }
            if (prev < A[i]) {
                if (dir == -1) {
                    return false;
                } else if (dir == 0) {
                    dir = 1;
                }
            } else {
                if (dir == 1) {
                    return false;
                }
                if (dir == 0) {
                    dir = -1;
                }
            }
            prev = A[i];
        }
        return true;
    }
}
