package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumProductOfWordLengths {

    Map<String, Set<Character>> map = new HashMap<>();
    public int maxProduct(String[] words) {
        int max =0;
        for (String word: words) {
            Set<Character> orDefault = map.getOrDefault(word, new HashSet<>());
            if (orDefault.isEmpty()) {
                for (Character ch : word.toCharArray()) {
                    orDefault.add(ch);
                }
                map.put(word, orDefault);
            }
        }
        for (int i=0; i<words.length; i++) {
            for (int j=i +1; j<words.length; j++) {
                if (valid(words[i], words[j])) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }

    private boolean valid(String word, String word1) {
        Set<Character> characters = map.get(word);
        for (Character ch: word1.toCharArray()) {
            if (characters.contains(ch)) {
                return false;
            }
        }
        return true;
    }
}
