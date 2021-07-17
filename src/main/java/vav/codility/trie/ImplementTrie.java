package vav.codility.trie;

import vav.codility.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplementTrie {
    TrieNode root;

    /** Initialize your data structure here. */
    public ImplementTrie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        char[] chars = word.toCharArray();
        for (Character ch: chars) {
            if (!cur.next.containsKey(ch)) {
                cur.next.put(ch, new TrieNode());
            }
            cur = cur.next.get(ch);
        }
        cur.list.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = root;
        for (Character ch: word.toCharArray()) {
            TrieNode node = cur.next.get(ch);
            if (node != null) {
                cur = node;
                continue;
            } else {
                return false;
            }
        }
        for (String w: cur.list) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (Character ch: prefix.toCharArray()) {
            TrieNode node = cur.next.get(ch);
            if (node != null) {
                cur = node;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static class TrieNode {
        List<String> list = new ArrayList();
        Map<Character, TrieNode> next = new HashMap<>();
    }
}
