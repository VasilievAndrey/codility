package vav.codility.arrays2;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates2 {

    public String removeDuplicates(String s) {
        boolean check = true;
        Stack<Character> st = new Stack<>();
        String tmp = s;
        while(check) {
            check = false;
            for (Character ch: tmp.toCharArray()) {
                if (st.isEmpty()) {
                    st.add(ch);
                    continue;
                }
                if  (ch == st.peek()) {
                    st.pop();
                    check = true;
                } else {
                    st.add(ch);
                }
            }
            char[] chs = new char[st.size()];
            int i= st.size() -1;
            while (!st.isEmpty()) {
                chs[i--] = st.pop();
            }
            tmp = new String(chs);

        }
        return tmp;
    }
}
