package vav.codility.arrays2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrieNodeSearch {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here
        TrieNode root = new TrieNode();
        Iterator<String> iterator = repository.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            TrieNode next = root;
            for (Character ch: word.toCharArray()) {
                if (next.childs[ch -'a'] == null) {
                    next.childs[ch - 'a'] = new TrieNode();
                }
                next = next.childs[ch - 'a'];
            }
            next.word = word;
        }
        List<List<String>> ans = new LinkedList();
        char[] chs = customerQuery.toCharArray();
        TrieNode next = root.childs[chs[0] - 'a'];
        for (int i=1; i<chs.length; i++) {
            next = next.childs[chs[i] -'a'];
            List<String> ls = new ArrayList();
            getAllWordsFrom(next, ls);
            ans.add(ls);
        }
        return ans;
    }

    private static void getAllWordsFrom(TrieNode node, List<String> ans) {
        if (node == null) {
            return;
        }
        if (node.word != null) {
            ans.add(node.word);
        }
        for (TrieNode n: node.childs) {
            if (n != null) {
                getAllWordsFrom(n, ans);
            }
        }
    }
    public static class TrieNode {
        String word;
        TrieNode[] childs;
        TrieNode() {
            childs = new TrieNode[26];
        }
    }

}
