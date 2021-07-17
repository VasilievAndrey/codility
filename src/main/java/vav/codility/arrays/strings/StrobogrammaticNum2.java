package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNum2 {

    private static Map<Character, Character> map = new HashMap<Character, Character>(){{
        put('0', '0');
        put('1', '1');
        put('6', '9');
        put('9', '6');
        put('8', '8');
    }};

    public boolean isStrobogrammatic(String num) {
        if (num.length() == 0) {
            return  false;
        }
        char[] chars = num.toCharArray();
        if (num.length() == 1) {
            return isStroboChar(chars[0]);
        }
        int left = 0;
        int right = num.length() -1;
        while (left < right) {
            char leftCh = chars[left];
            Character expCh = map.get(leftCh);
            if (chars[right] != expCh) {
                return false;
            }
            left++;
            right--;
        }
        if (num.length() % 2 == 1) {
            return isStroboChar(chars[left+1]);
        } else {
            return true;
        }
    }

    private boolean isStroboChar(char aChar) {
        if (map.keySet().contains(aChar)) {
            return true;
        } else {
            return false;
        }
    }
}
