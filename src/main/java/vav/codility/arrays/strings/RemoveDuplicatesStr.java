package vav.codility.arrays.strings;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class RemoveDuplicatesStr {

    public String removeDuplicates(String s) {
        if (s.length() <2) {
            return s;
        }
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for (Character c: s.toCharArray()) {
            q.add(c);
        }
        while(q.size() > 1) {
            boolean dub = false;
            st.clear();
            st.add(q.poll());
            while (!q.isEmpty()) {
                Character poll = q.poll();
                if (!st.isEmpty()&& st.peek() == poll) {
                    dub = true;
                    st.pop();
                    continue;
                }
                st.add(poll);
            }
            q.addAll(st);
            if (!dub) {
                break;
            }
        }
        StringBuilder bl = new StringBuilder();
        for (Character c: q) {
            bl.append(c);
        }
        return bl.toString();
    }
}
