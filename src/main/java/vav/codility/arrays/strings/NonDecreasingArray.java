package vav.codility.arrays.strings;

import java.util.Stack;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums.length <2) {
            return true;
        }
        int count =0;
        Stack<Integer> st = new Stack<>();
        st.add(nums[0]);
        for (int i=1; i<nums.length; i++) {
            if (st.peek() > nums[i]) {
                count++;
                if (count >1) {
                    return false;
                }
                Integer pop = st.pop();
                if (st.size() > 0 && st.peek() > nums[i]) {
                    st.add(pop);
                    continue;
                }
            }
            st.add(nums[i]);
        }
        return true;
    }
}
