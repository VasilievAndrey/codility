package vav.codility;

public class ArrayRotation {

    public int[] solution(int[] a, int k) {
        // write your code in Java SE 8
        int length = a.length;
        int[] b = new int[length];
        for (int i = length - k; i <= length -1; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < length - k; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
