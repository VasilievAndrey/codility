package vav.codility.interview;

public class IsPalindromeDelete {

    public boolean validPalindrome(String s) {

        char[] chars = s.toCharArray();
        int left =0;
        int right = chars.length -1;
        int count = 0;
        while(left<right){
            if (chars[left] == chars[right]) {
                left++;
                right--;
                continue;
            } else {
                if (count == 1) {
                    return false;
                } else {
                    if (helper(chars, left + 1, right)
                            || helper(chars, left,right -1)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean helper(char[] chars, int left, int right) {
        while(left<right){
            if (chars[left] == chars[right]) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
