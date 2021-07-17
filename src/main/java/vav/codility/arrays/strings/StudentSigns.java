package vav.codility.arrays.strings;

public class StudentSigns {

    private void helper(int i, int start, int[] arr, int count, int[] ans) {
        if (arr[i] -1 == start) {
            ans[start] = count;
        } else {
            helper(arr[i] -1, start, arr,count+1, ans);
        }

    }

    public int[] findSignatureCounts(int[] arr) {
        // Write your code here
        int n = arr.length;
        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            helper(i, i, arr, 1, ans);
        }
        return ans;
    }

}
