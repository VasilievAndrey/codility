package vav.codility.arrays.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseOnlyVowels {

    Set<Character> vowels = new HashSet<Character>() {{add('a');add('e');add('i');add('o');add('u');add('A');add('E');add('I');add('O');add('U');}};
    public String reverseVowels(String s) {

        Stack<Character> st = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (vowels.contains(Character.valueOf(ch))) {
                st.add(ch);
            }
        }
        StringBuilder bl = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (vowels.contains(Character.valueOf(ch))) {
                bl.append(st.pop());
            } else {
                bl.append(ch);
            }
        }
        return bl.toString();
    }
}
