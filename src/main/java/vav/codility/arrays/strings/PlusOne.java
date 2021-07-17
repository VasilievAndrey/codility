package vav.codility.arrays.strings;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int indx = digits.length -1;
        while (true) {
            if (digits[indx] ==9) {
                digits[indx] = 0;
            } else {
                digits[indx] +=1;
                break;
            }
            indx--;
            if (indx < 0) {
                break;
            }
        }
        if (indx < 0) {
            int[] ans = new int[digits.length +1];
            ans[0]=1;
            return ans;
        } else {
            return digits;
        }
    }
}
