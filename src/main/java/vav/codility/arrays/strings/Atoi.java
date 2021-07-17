package vav.codility.arrays.strings;

public class Atoi {

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        Long result = 0l;
        int res = 0;
        int sign = 1;
        boolean start = false;
        for (int i =0; i< chars.length; i++) {
            if ((result == 0 && !isInt(chars[i]) && chars[i] != '-' && chars[i] != ' ' && chars[i] != '+')
                || (result == 0 && (chars[i] == '-' || chars[i] == '+') && i < chars.length -1 && !isInt(chars[i+1]))) {
                return 0;
            }
            if (start && !isInt(chars[i])) {
                break;
            }
            if (chars[i] == '-' &&
                    i < chars.length - 1 &&
                    isInt(chars[i + 1]))  {
                sign = -1;
            } else if (chars[i] > 47 && chars[i] < 58) {
                start = true;
                if (result > 0) {
                    result = result * 10;
                }
                result =result + chars[i] - 48;
            }
            if (result > Integer.MAX_VALUE) {
                if (sign < 0) {
                    return (Integer.MAX_VALUE + 1) * sign;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return result.intValue() * sign;
    }

    private static boolean isInt(char aChar) {
        return aChar > 47 && aChar < 58;
    }

}
