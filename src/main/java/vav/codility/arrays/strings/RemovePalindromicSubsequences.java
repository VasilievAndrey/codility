package vav.codility.arrays.strings;

public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if (s.equals("")) {
            return 0;
        }
        if (isPolindrome(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean isPolindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while(left < right) {
            if (chars[left]!=chars[right]) {
                return false;
            }
        }
        return true;
    }
}
