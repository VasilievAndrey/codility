package vav.codility.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DesignAddandSearchWordsDataStructure {

    TrieNode root;
    /** Initialize your data structure here. */
    public DesignAddandSearchWordsDataStructure() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        if (word == null) {
            return;
        }
        TrieNode cur = root;
        for (Character ch: word.toCharArray()) {
            if (!cur.next.containsKey(ch)) {
                cur.next.put(ch, new TrieNode());
            }
            cur = cur.next.get(ch);
        }
        cur.word = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;

        return searchIn(word, cur);
    }

    private boolean searchIn(String word, TrieNode root) {
        TrieNode cur = root;

        for (int i=0; i<word.length(); ++i) {
            Character ch = word.charAt(i);
            if (ch == '.') {
                for (Character c : cur.next.keySet()) {
                    TrieNode child = cur.next.get(c);
                    if (searchIn(word.substring(i+1), child)) {
                        return true;
                    }
                }
                return false;
            } else {
                cur = cur.next.get(ch);
                if (cur == null) {
                    return false;
                }
            }
        }
        return cur.word;
    }

    public static class TrieNode {
        boolean word;
        Map<Character, TrieNode> next = new HashMap<>();
    }
}
