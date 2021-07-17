package vav.codility.noidea;


import java.util.Stack;

public class StringPathToCanonical {

    public String simplifyPath(String path) {
        char[] chars = path.toCharArray();
        if (path.length() == 1) {
            return "/";
        }
        Stack<String> st = new Stack<>();
        for (int i=0; i< chars.length -1; i++) {
            if (chars[i] == '.' && chars[i+1] == '/') {
                continue;
            }
            if(chars[i] == '.' && chars[i+1] == '.') {
                if (st.size() > 1) {
                    st.pop();
                    st.pop();
                    if (st.isEmpty()) {
                        st.add("/");
                    }
                }
                continue;
            }
            if (chars[i] == '/' && chars[i+1] == '/') {
                continue;
            }
            if (chars[i] == '/') {
                if (i<chars.length -2 && chars[i+1] == '.' && chars[i+2] == '.') {
                    continue;
                }
                i++;
                if (i<chars.length) {
                    st.add("/");
                    StringBuilder bl = new StringBuilder();
                    while (i < chars.length && chars[i] != '/') {
                        bl.append(chars[i++]);
                    }
                    st.add(bl.toString());
                    continue;
                } else {
                    break;
                }
            }
            st.add(String.valueOf(chars[i]));
        }

        StringBuilder ans = new StringBuilder();
        Stack<String> st2 = new Stack<>();
        while(!st.isEmpty()) {
            st2.add(st.pop());
        }
        while (!st2.isEmpty()) {
            ans.append(st2.pop());
        }
        return ans.toString();
    }
}
