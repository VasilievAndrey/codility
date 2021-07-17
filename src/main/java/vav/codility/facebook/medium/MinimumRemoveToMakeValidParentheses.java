package vav.codility.facebook.medium;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

    public static String minRemoveToMakeValid(String s) {
        if (s == null || s.length() == 0 || s.equals("")) {
            return s;
        }
        int i = 0;
        int length = s.length();
        Stack<Integer> stack = new Stack<>() ;
        StringBuilder builder = new StringBuilder();
        int j = 0;
        while (i < length) {
            char chr = s.charAt(i);
            if (chr == '(' || chr == ')') {
                if (chr == '(') {
                    stack.add(j);
                    builder.append(chr);
                    j++;
                } else if (chr == ')' && stack.size() > 0 ) {
                    stack.pop();
                    builder.append(chr);
                    j++;
                }
            } else {
                builder.append(chr);
                j++;
            }
            i++;
        }
        return cleanLeftOver(stack, builder.toString());
    }

    private static String cleanLeftOver(Stack<Integer> stack, String builder) {
        char[] chars = builder.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!stack.contains(i)) {
                res.append(chars[i]);
            }
        }
        return res.toString();
    }

}
