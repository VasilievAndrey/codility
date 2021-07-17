package vav.codility.arrays.strings;

public class ReplaceAllQuestions {

    char A = 'a';

    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            if (chars[0]== '?') {
                return String.valueOf('a');
            } else {
                return s;
            }
        }
        for (int i =0; i< chars.length; i++) {
            if (chars[i] == '?') {
                checkAndReplace(chars, i);
            }
        }
        return String.valueOf(chars);
    }

    private void checkAndReplace(char[] chars, int i) {
        char tmp = A;
        if (i == 0) {
           while (tmp == chars[1]) {
               tmp++;
           }
           chars[i] = tmp;
           return;
        }
        if (i == chars.length -1) {
            while (tmp == chars[i - 1]) {
                tmp++;
            }
        } else {
            while (tmp == chars[i - 1] || tmp == chars[i + 1]) {
                tmp++;
            }
        }
        chars[i] = tmp;
    }
}
