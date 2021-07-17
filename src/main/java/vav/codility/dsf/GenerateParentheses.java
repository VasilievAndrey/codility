package vav.codility.dsf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(n -1, "("));

        while (!q.isEmpty()) {
            int s = q.size();
            Pair peek = q.peek();
            if (peek.st.length() == n*2) {
                break;
            }
            for (int i=0; i<s; i++) {
                Pair poll = q.poll();
                if (poll.count > 0) {
                    Pair next = new Pair(poll.count -1, poll.st + "(");
                    q.add(next);

                    Pair next2 = new Pair(poll.count, poll.st + ")");
                    q.add(next2);

                } else {
                    Pair next2 = new Pair(poll.count, poll.st + ")");
                    q.add(next2);
                }
            }
        }
        Set<String> set = new HashSet<>();
        for (Pair p: q) {
            if (isValid(p.st)) {
                set.add(p.st);
            }
        }
        return new ArrayList<>(set);
    }
    private boolean isValid(String w) {
        char[] chs = w.toCharArray();
        Stack<Character> st = new Stack<>();
        for (Character ch: chs) {
            if (ch == '(') {
                st.add('(');
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    private static class Pair {
        private Integer count;
        private String st;

        public Pair(Integer count, String st) {
            this.count = count;
            this.st = st;
        }
    }
}
