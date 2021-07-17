package vav.codility.arrays.strings;

public class ValidNumber {

    public boolean isNumber(String s) {
        boolean num = false,
                exp = false,
                sign = false,
                dec = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (Character.isDigit(c)) num = true ;
            else if (c == 'e' || c == 'E') {
                if (exp || !num) return false;
                else {
                    exp = true;
                    sign = false;
                    num = false;
                    dec = false;
                }
            } else if (c == '+' || c == '-') {
                if (sign || num || dec) return false;
                else sign = true;
            } else if (c == '.') {
                if (dec || exp) return false;
                else dec = true;
            } else return false;
        }
        return num;
    }
}
