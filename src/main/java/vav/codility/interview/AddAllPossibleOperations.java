package vav.codility.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAllPossibleOperations {

    public List<String> addOperators(String num, int target) {
        if (num.length() == 1) {
            if (num.charAt(0) - '0' == target) {
                return Arrays.asList(num);
            } else {
                return Collections.emptyList();
            }
        }
        List<String> ans = new ArrayList<>();
        char[] chars = num.toCharArray();
        dfs(chars, 1, 0,chars[0] - '0',  target, new StringBuilder().append(chars[0]), ans);
        return ans;
    }

    private void dfs(char[] chars, int i, int left, int cur, int target, StringBuilder b, List<String> ans) {
        if (chars.length == i) {
            if (left + cur == target) {
                ans.add(b.toString());
            }
            return;
        }
        if (chars[i] == 0) {
            dfs(chars, i + 1, left, cur * (chars[i] - '0'), target, new StringBuilder().append(b).append('*').append(chars[i]), ans);
        }
        dfs(chars, i + 1, left + cur, chars[i] - '0', target, new StringBuilder().append(b).append('+').append(chars[i]), ans);
        dfs(chars, i + 1, left + cur, -chars[i] - '0', target, new StringBuilder().append(b).append('-').append(chars[i]), ans);
        dfs(chars, i + 1, left, cur * (chars[i] - '0'), target, new StringBuilder().append(b).append('*').append(chars[i]), ans);
    }
}
