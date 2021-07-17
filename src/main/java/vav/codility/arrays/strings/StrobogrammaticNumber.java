package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    private static Map<Character, Character> map = new HashMap<Character, Character>(){{
     put('0', '0');
     put('1', '1');
     put('6', '9');
     put('9', '6');
     put('8', '8');
    }};

    public static boolean isStrobogrammatic(String num) {
        char[] chars = num.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while (left < right) {
            Character leftMirr = map.get(chars[left]);
            if (leftMirr ==null || leftMirr != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        if (chars.length % 2 == 1 &&( map.get(chars[left]) == null
                || map.get(chars[left]) == '6'
                || map.get(chars[left]) == '9')) {
            return false;
        }
        return true;
    }
}

