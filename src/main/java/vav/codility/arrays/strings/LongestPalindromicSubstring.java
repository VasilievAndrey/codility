package vav.codility.arrays.strings;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String maxResult = String.valueOf(s.charAt(0));

        char[] chars = s.toCharArray();
        int i = 0;
        while (i< s.length()) {
            char leftCh = chars[i];
            if (i < s.length() -2 && chars[i] == chars[i+1]) {
                int lenght = 0;
                    while (i < s.length() -1 && chars[i] == chars[i+1]) {
                        lenght++;
                        i++;
                    }
                    String str = s.substring(i -lenght, i + 1);
                    if(maxResult.length() < str.length()) {
                        maxResult = str;
                    }
            } else {
                int j = i +1;
                while (j < s.length() && s.indexOf(leftCh, j) > 0) {
                    int right = s.indexOf(leftCh, j);
                    if (right > 0 && isPalindrom(i, right, chars)) {
                        String str = s.substring(i, right + 1);
                        if (maxResult.length() < str.length()) {
                            maxResult = str;
                        }
                    }
                    j = right + 1;
                }
            }
            i++;
        }
        return maxResult;
    }


    private static boolean isPalindrom(int left, int right, char[] chars) {
        while (left< right) {
            if(chars[left++] != chars[right--]) {
                return false;
            }

        }
        return true;
    }
}
