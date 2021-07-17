package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static Map<Character, Character> parenthesesMap = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
    }};

    public static boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (characterStack.size() == 0) {
                if (addOrBreak(characterStack, chars[i])) return false;
            } else {
                Character top = characterStack.peek();
                if (top == chars[i]) {
                    characterStack.pop();
                } else {
                    if (addOrBreak(characterStack, chars[i])) return false;
                }
            }
        }
        return characterStack.size() == 0;
    }

    private static boolean addOrBreak(Stack<Character> characterStack, char aChar) {
        Character reversChar = parenthesesMap.get(aChar);
        if (reversChar == null) {
            return true;
        }
        characterStack.add(reversChar);
        return false;
    }
}
