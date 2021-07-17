package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    public int numDecodings(String s) {
        Map<String, Character> map = new HashMap<>();
        Map<Integer, Integer> memo = new HashMap<>();
        int i = 1;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            map.put(String.valueOf(i), ch);
            i++;
        }
        char[] chars = s.toCharArray();
        return dfs(0, chars, map, memo);
    }

    private int dfs(int i, char[] chars, Map<String, Character> map, Map<Integer, Integer> memo) {
        Integer fromMem = memo.get(i);
        if (fromMem != null) {
            return fromMem;
        }
        int count = 0;
        if (i == chars.length) {
            return 1;
        }
        String key = Character.toString(chars[i]);
        Character ch = map.get(key);
        if (ch != null) {
            count += dfs(i + 1, chars, map, memo);
        }
        if (i < chars.length - 1) {
            key = new StringBuilder().append(chars[i]).append(chars[i + 1]).toString();
            Character ch2 = map.get(key);
            if (ch2 != null) {
                count += dfs(i + 2, chars, map, memo);
            }
        }
        memo.put(i, count);
        return count;
    }

}
