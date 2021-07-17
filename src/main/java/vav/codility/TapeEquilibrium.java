package vav.codility;

public class TapeEquilibrium {

    public static int solution(int[] a) {
        // write your code in Java SE 11
        int len = a.length;
        int total = 0;
        for (int i=0; i < len; i++) {
            total += a[i];
        }
        int leftSum = 0;
        int prevDiff = 0;
        int rightSum = total;
        int diff;
        int res = 0;
        for (int i=0; i < len; i++) {
            leftSum += a[i];
            rightSum = total - leftSum;
            diff = rightSum - leftSum;
            if (prevDiff != 0 && diff == 0 ) {
                res = diff;
                break;
            }
            if (prevDiff == 0 || (prevDiff > diff && diff > 0)) {
                prevDiff = diff;
                res = diff;
            } else if (prevDiff != 0 && diff < 0) {
                res = prevDiff;
                break;
            }
        }
        return res;

    }
}
