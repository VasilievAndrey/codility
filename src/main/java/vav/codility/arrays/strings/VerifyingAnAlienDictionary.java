package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {


    public boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) {
            return true;
        }
        String prev = words[0];
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = order.toCharArray();
        for (int i=0; i<chars.length; i++) {
            map.put(chars[i], i);
        }
        for (int i=1; i< words.length; i++) {
            if (!isInOrder(prev, words[i], map)) {
                return false;
            }
            prev = words[i];
        }

        return true;
    }

    private boolean isInOrder(String prev, String word, Map<Character, Integer> map) {
        if (prev.equals(word)) {
            return true;
        }
        int min = Math.min(prev.length(), word.length());
        char[] first = prev.toCharArray();
        char[] sec = word.toCharArray();
        for (int i =0; i< min; i++) {
            if (map.get(first[i]) < map.get(sec[i])) {
                return true;
            }
            else  if (map.get(first[i]) == map.get(sec[i])) {
                continue;
            } else {
                return false;
            }
        }
        if (prev.length() > min) {
            return false;
        }
        return true;
    }
}
