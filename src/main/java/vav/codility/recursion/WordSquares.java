package vav.codility.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class WordSquares {

    public static List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<>();
        if (words.length == 0 || words[0].length() == 0) {
            return result;
        }
        if (words.length == 1 || words[1].length() == 0) {
            result.add(asList(words[0]));
            return result;
        }

        for (String word : words) {
            List<String> collected = new ArrayList<>(asList(word));
            List<String> wordList = new ArrayList<>(asList(words));
            backtrack(word.length(), wordList, word, collected, result);
        }
        return result;
    }

    private static void backtrack(int length, List<String> words, String current, List<String> collected, List<List<String>> result) {
        int indx =collected.size()-1;
        if (indx == current.length()) {
            return;
        }

        String pref = buildPrefix(indx + 1, collected);
        List<String> allWithPrefix = findAllWithPrefix(pref, words);
        for (String next : allWithPrefix) {
            if (collected.size() == length -1) {
                List<String> out =  new ArrayList<>();
                out.addAll(collected);
                out.add(next);
                result.add(out);
            } else {
                collected.add(next);
                backtrack(length, words, current, collected, result);
                collected.remove(next);
            }
        }
    }

    private static String buildPrefix(int indx, List<String> collected) {
        char[] pref = new char[collected.size()];
        for (int i = 0; i< collected.size(); i++) {
            pref[i] = collected.get(i).charAt(indx);
        }
        return String.valueOf(pref);
    }

    private static List<String> findAllWithPrefix(String pref, List<String> words) {
        return words.stream().filter(word -> word.startsWith(pref)).collect(Collectors.toList());
    }
}
