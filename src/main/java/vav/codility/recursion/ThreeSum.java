package vav.codility.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
    public int threeSumMulti(int[] arr, int target) {
        int MOD = 1_000_000_007;
        Arrays.sort(arr);
        int ans = 0;
        for (int i=0; i< arr.length -2; i++) {
            int limit = target - arr[i];
            if (limit > 0) {
                int left = i +1;
                int right = arr.length -1;
                while (left < right) {
                    if (arr[left]+ arr[right] > limit) {
                        right--;
                    } else if (arr[left] + arr[right] < limit) {
                        left++;
                    } else if (arr[left] != arr[right]) {
                        int countLeft = 1;
                        int countRight = 1;
                        while (left +1 < right && arr[left] == arr[left+1]) {
                            countLeft++;
                            left++;
                        }
                        while(right -1 > left && arr[right] == arr[right -1] ) {
                            countRight++;
                            right--;
                        }
                        ans += countLeft * countRight;
                        left++;
                        right--;
                        ans %= MOD;
                    } else {
                        ans += (right-left+1) * (right-left) / 2;
                        ans %= MOD;
                        break;
                    }
                }
            }
        }
      return ans;
    }
}
