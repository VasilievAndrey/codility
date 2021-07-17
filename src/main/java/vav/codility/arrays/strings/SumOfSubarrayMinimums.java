package vav.codility.arrays.strings;

import java.util.Stack;

public class SumOfSubarrayMinimums {

    public int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9 +7;
        Stack<int[]> stLeft = new Stack<>();
        Stack<int[]> stRight = new Stack<>();
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i=0; i<n; i++) {
            int count =1;
            while (!stLeft.empty() && stLeft.peek()[0] > arr[i])
                count += stLeft.pop()[1];
            stLeft.push(new int[]{arr[i], count});
            left[i] = count;
        }
        for (int i=n -1; i>=0; i--) {
            int count =1;
            while (!stRight.empty() && stRight.peek()[0] >= arr[i])
                count += stRight.pop()[1];
            stRight.push(new int[]{arr[i], count});
            right[i] = count;
        }
        long ans =0;
        for (int i=0; i<n; i++) {
            ans =  (ans + (long) arr[i] * left[i] *right[i]) % mod;
        }
        return (int) ans;
    }
}
