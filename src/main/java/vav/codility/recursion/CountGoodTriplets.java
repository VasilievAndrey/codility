package vav.codility.recursion;

public class CountGoodTriplets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count =0;
        for (int i =0; i<arr.length -2; i++) {
            int j = i +1;
            while (j < arr.length -1) {
                int k = j +1;
                while (k < arr.length) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <=c) {
                        count++;
                    }
                    k++;
                }
                j++;
            }
        }
        return count;
    }
}
