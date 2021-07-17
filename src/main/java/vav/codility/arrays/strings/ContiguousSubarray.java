package vav.codility.arrays.strings;

import java.util.Stack;

public class ContiguousSubarray {


    int[] countSubarrays(int[] arr) {
        // Write your code here
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[i] += ans[st.pop()];
            }
            ans[i]++;
            st.push(i);
        }
        st.clear();
        int[] right = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int ind = st.pop();
                ans[i] += right[ind];
                right[i] += right[ind];
            }
            st.push(i);
            right[i]++;
        }
        return ans;
    }

}
