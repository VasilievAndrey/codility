package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelSpellchecker {

    private static final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o','u');
    private static final Map<String, List<String>> consMap = new HashMap<>();
    private Map<String, String> map = new HashMap<>();
    public String[] spellchecker(String[] wordlist, String[] queries) {
        for (String word: wordlist) {
            map.put(word, word);
            String key = onlyConsonants(word);
            List<String> consWords = consMap.get(key);
            if (consWords == null) {
                consWords = new ArrayList<>();
            }
            consWords.add(word);
            consMap.put(key, consWords);
        }


        List<String> result = Arrays.stream(queries).map(input -> {
            String res = checkCaseInsensitive(input);
            if(res !=null) return res;
            return checkVowels(wordlist, input);
        }).collect(Collectors.toList());
        return result.toArray(new String[result.size()]);
    }

    private String onlyConsonants(String str) {
        String res = str.toLowerCase();
        for (char ch: vowels) {
            res = res.replace(String.valueOf(ch), "");
        }
        return res;
    }

    private String checkVowels(String[] words, String input) {
        String key = onlyConsonants(input);
        List<String> wordList = null;
        if (key.equals("")) {
            wordList = Arrays.stream(words).collect(Collectors.toList());
        } else {
            wordList = consMap.get(key);
        }
        if (wordList == null) {
            return "";
        }
        for (String w: wordList) {
            int count = 0;
            String word = w.toLowerCase();
            for (int i = 0; i< input.length(); i++) {
                String lowerCase = input.toLowerCase();
                if (word.charAt(i) == lowerCase.charAt(i)
                        || word.charAt(i) != input.charAt(i) &&
                        vowels.contains(lowerCase.charAt(i)) && vowels.contains(word.charAt(i))) {
                } else {
                    count = -1;
                    break;
                }
            }
            if (count != -1) {
                return w;
            }
        }
        return "";
    }

    private String checkCaseInsensitive(String input) {
        String res = map.get(input);
        if (res == null) {
            for (String word: map.keySet()) {
                if (word.equalsIgnoreCase(input)) {
                    return word;
                }
            }
        } else  {
            return res;
        }
        return null;
    }
}
