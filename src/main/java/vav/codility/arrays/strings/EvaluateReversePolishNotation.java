package vav.codility.arrays.strings;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String tk: tokens) {
            char[] chars = tk.toCharArray();
            if (chars.length == 1 && Character.isDigit(chars[0]) || chars.length >1) {
                st.add(Integer.parseInt(tk));
            } else {
                Integer a = st.pop();
                Integer b = st.pop();
                if (chars[0] == '+') {
                    st.add(a+b);
                } else if (chars[0] == '-') {
                    st.add(b-a);
                } else if (chars[0] == '*') {
                    st.add(a*b);
                } else if (chars[0] == '/') {
                    st.add(b/a);
                }
            }
        }
        return st.pop();
    }
}
