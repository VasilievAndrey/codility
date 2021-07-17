package vav.codility.arrays.strings;

public class MinimumOperationsToMakeArrayEqual {

    public int minOperations(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            arr[i] = (2 * i) + 1;
            sum += arr[i];
        }
        int tr = sum /n;
        int count =0;
        for (int i =0; i<n; i++) {
            if (arr[i] == tr) {
                continue;
            } else {
                count += Math.abs(arr[i] -tr);
            }
        }
        return count/2;
    }
}
