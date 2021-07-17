package vav.codility.arrays.strings;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int n = s.length();

        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        int result = 0;

        for (int i = 0; i < n; i++)
        {
            if (s.charAt(i) == '(')
                stk.push(i);
            else
            {
                if(!stk.empty())
                    stk.pop();

                if (!stk.empty())
                    result = Math.max(result, i - stk.peek());

                else
                    stk.push(i);
            }
        }

        return result;
    }
}
