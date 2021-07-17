package vav.codility.interview;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (s.length() < 2) {
                return true;
        }
        int left =0;
        int right = chars.length -1;
        boolean ch = false;
        while (left<right) {
            while(!isAlphaNumeric(chars[left]) && left < right){
                left++;
                continue;
            }
            while(!isAlphaNumeric(chars[right]) && right > left){
                right--;
                continue;
            }
            if (Character.toLowerCase(chars[left]) == Character.toLowerCase(chars[right])) {
                ch = true;
                left++;
                right--;
            } else {
                return false;
            }
        }
        return ch;
    }

    private boolean isAlphaNumeric(char ch) {
        return Character.isAlphabetic(ch) || Character.isDigit(ch);
    }

}
