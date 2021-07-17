package vav.codility.arrays.strings;

public class ToLowerCase {

    public String toLowerCase(String s) {
        char[] chs = s.toCharArray();
        StringBuilder bl = new StringBuilder();
        for (char c: chs) {
            if (c < 'a' && Character.isLetter(c)) {
                bl.append((char) (c + ('a' - 'A')));
            } else {
                bl.append(c);
            }
        }
        return bl.toString();
    }
}
