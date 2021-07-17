package vav.codility.arrays.strings;

public class ReverseString {

    public void reverseString(char[] s) {
        if (s.length <=1) {
            return;
        }
        int left = 0;
        int right = s.length -1;
        while (left < right) {
            swap(s, left++, right--);
        }
    }

    private void swap(char[] s, int i, int i1) {
        char tmp = s[i];
        s[i] = s[i1];
        s[i1] = tmp;
    }
}
