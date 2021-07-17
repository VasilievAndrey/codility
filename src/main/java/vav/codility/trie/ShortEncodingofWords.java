package vav.codility.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShortEncodingofWords {

    public int minimumLengthEncoding(String[] words) {
        List<TrieNode> leaves = new ArrayList<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));
        TrieNode root = new TrieNode();
        for (String word : set) {
            TrieNode cur = root;
            char[] chars = word.toCharArray();
            for (int i=word.length() -1; i>=0; i--) {
                Character ch = chars[i];
                if (!cur.next.containsKey(ch)) {
                    cur.next.put(ch, new TrieNode());
                }
                cur = cur.next.get(ch);
            }
            cur.depth = word.length() +1;
            leaves.add(cur);
        }
        int ans = 0;
        for (TrieNode leaf: leaves) {
            if (leaf.next.isEmpty()) {
                ans += leaf.getDepth();
            }
        }
        return ans;
    }

    public static class TrieNode {
        int depth;
        HashMap<Character, TrieNode> next = new HashMap<>();

        public int getDepth() {
            return depth;
        }

        public HashMap<Character, TrieNode> getNext() {
            return next;
        }
    }
}
