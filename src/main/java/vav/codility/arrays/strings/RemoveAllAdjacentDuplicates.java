package vav.codility.arrays.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public String removeDuplicates(String s, int k) {

        StringBuilder bl = new StringBuilder();
        Queue<Character> st = new LinkedList<>();
        for (Character ch: s.toCharArray()) {
            st.add(ch);
        }

        while(!st.isEmpty()) {
            int size = st.size();
            Stack<Character> tmp = new Stack<>();
            int count = 1;
            Character prev = '1';
            boolean rm = false;
            for (int i=0; i<size; i++) {
                Character pop = st.poll();
                if (pop == prev) {
                    count++;
                    if (count == k) {
                        for (int l=1; l<k; l++) {
                            tmp.pop();
                        }
                        if (tmp.size() > 0) {
                            prev = tmp.peek();
                        }
                        count = 1;
                        rm = true;
                        continue;
                    }
                } else {
                    count = 1;
                }
                prev = pop;
                tmp.add(pop);
            }

            st.addAll(tmp);
            if (!rm) {
                break;
            }
        }

        int size = st.size();
        for (int i = 0; i< size; i++) {
            bl.append(st.poll());
        }
        return bl.toString();
    }
}
