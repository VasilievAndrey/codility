package vav.codility.arrays.strings;

public class PairSums {


        int numberOfWays(int[] arr, int k) {
            // Write your code here
            int ans = 0;
            for (int i=0; i<arr.length-1; i++) {
                for (int j=i+1; j<arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        ans++;
                    }
                }
            }
            return ans;
        }

    }
