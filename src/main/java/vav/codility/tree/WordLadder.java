package vav.codility.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words such that:

The first word in the sequence is beginWord.
The last word in the sequence is endWord.
Only one letter is different between each adjacent pair of words in the sequence.
Every word in the sequence is in wordList.
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.

Example 1:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog" with 5 words.
 */
public class WordLadder {

    private static Map<String, List<String>> map = new ConcurrentHashMap<>();

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        map.clear();
        List<List<String>> sequences = new ArrayList<>();
        List<String> currentSeq = new LinkedList<>();
        currentSeq.add(beginWord);
        Set<String> visited = new HashSet<>();
        findSequence(beginWord, endWord, wordList, currentSeq, sequences, visited);
        sequences.sort(Comparator.comparingInt(List::size));
        System.out.println("sequence: " + sequences);
        if (sequences.size() > 0) {
            return sequences.get(0).size();
        }
        return 0;

    }

    public static void findSequence(String beginWord, String endWord, List<String> wordList, List<String> currentSeq, List<List<String>> result, Set<String> visited) {
        Set<String> nextVisited = new HashSet(visited);
        List<String> newCurrentSeq = new LinkedList<>(currentSeq);
        if (beginWord.equals(endWord)) {
            result.add(newCurrentSeq);
            return;
        }

        List<String> nextList = new LinkedList<>(wordList);
        nextList.remove(beginWord);

        List<String> oneLetterDiff = map.get(beginWord);
        if (oneLetterDiff == null) {
            oneLetterDiff = findOneLetterDiff(beginWord, nextList);
            map.put(beginWord, oneLetterDiff);
            for (String item : oneLetterDiff) {
                if (!nextVisited.contains(item)) {
                    nextVisited.add(item);
                    newCurrentSeq.add(item);
                    if (item.equals(endWord)) {
                        result.add(newCurrentSeq);
                    } else {
                        nextList.remove(item);
                        findSequence(item, endWord, nextList, newCurrentSeq, result, nextVisited);
                        newCurrentSeq.remove(item);
                    }
                }
            }
        }
    }

    private static List<String> findOneLetterDiff(String word, List<String> wordList) {
        List<String> subList = new ArrayList<>();
        wordList.stream().forEach(item -> {
            if (hasOneLetterDiff(word, item)) {
                subList.add(item);
            }
        });
        return subList;
    }

    private static boolean hasOneLetterDiff(String word, String item) {
        if (word.length() == item.length()) {
            int i = 0;
            for(int j=0; j < word.length(); j++) {
                if (word.charAt(j) != item.charAt(j)) {
                    i++;
                }
            }
            return i > 1 ? false: true;
        } else if (word.length() + 1 == item.length()) {
            return item.contains(word);
        } else if (word.length() == item.length() + 1) {
            return word.contains(item);
        } else {
            return false;
        }
    }
}
