package vav.codility.arrays.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PernuteTheTString {

    public String customSortString(String S, String T) {
        char[] chars = S.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<chars.length; i++) {
            map.put(Character.valueOf(chars[i]), i);
        }
        Comparator<Character> comp = Comparator.comparingInt(o -> map.getOrDefault(o, 200));
        Queue<Character> pq = new PriorityQueue<>(comp);
        char[] chars1 = T.toCharArray();
        for (int i=0; i<T.length(); i++) {
            pq.add(chars1[i]);
        }
        StringBuilder bl = new StringBuilder();
        while (!pq.isEmpty()) {
            bl.append(pq.poll());
        }
        return bl.toString();
    }
}
