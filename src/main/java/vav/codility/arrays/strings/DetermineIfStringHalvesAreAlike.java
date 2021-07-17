package vav.codility.arrays.strings;

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {

    Set<Character> vowels = new HashSet<Character>() {{add('a');add('e');add('i');add('o');add('u');add('A');add('E');add('I');add('O');add('U');}};
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String token1 = s.substring(0, mid +1);
        String token2 = s.substring(mid);
        char[] chars = token1.toCharArray();
        char[] chars2 = token2.toCharArray();
        int count = 0;
        int count2 = 0;
        for (int i =0; i <mid; i++) {
            if (vowels.contains(chars[i])) {
                count++;
            }
            if (vowels.contains(chars2[i])) {
                count2++;
            }
        }
        return count == count2;
    }
}
