package vav.codility.design;

import java.util.ArrayDeque;
import java.util.Deque;

public class StreamChecker {

    public class TrieNode {
        boolean w;
        TrieNode childs[] = new TrieNode[26];
    }

    TrieNode root = new TrieNode();
    Deque<Character> q = new ArrayDeque();

    public StreamChecker(String[] words) {
        for (String word : words) {
            String chs = new StringBuilder(word).reverse().toString();
            TrieNode next = root;
            for (char ch : chs.toCharArray()) {
                int i = ch - 'a';
                if (next.childs[i] == null) {
                    TrieNode node = new TrieNode();
                    next.childs[i] = node;
                    next = node;
                } else {
                    next = next.childs[i];
                }
            }
            next.w = true;
        }

    }

    public boolean query(char letter) {
        q.addFirst(letter);
        TrieNode next = root;
        for (char ch : q) {
            if (next.w) {
                return true;
            } else if (next.childs[ch - 'a'] == null) {
                return false;
            }
            next = next.childs[ch - 'a'];
        }
        return next.w;
    }
}
