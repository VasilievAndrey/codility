package vav.codility.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchSuggestionsSystem {
    TrieNode root = new TrieNode();



    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        for (String w : products) {
            TrieNode next = root;
            for (Character ch : w.toCharArray()) {
                if (next.childs[ch - 'a'] == null) {
                    next.childs[ch - 'a'] = new TrieNode();
                }
                next = next.childs[ch - 'a'];
            }
            next.w = w;
        }
        List<List<String>> ans = new ArrayList<>();
        TrieNode next = root;
        for (Character ch : searchWord.toCharArray()) {
            TrieNode cur = next.childs[ch - 'a'];
            if (cur == null) {
                ans.add(new ArrayList<>());
                continue;
            }
            next = cur;
            List<String> res = find(next);
            Collections.sort(res, (a,b) -> a.compareTo(b));
            if (res.size() > 3) {
                ans.add(res.subList(0,3));
            } else {
                ans.add(res);
            }
        }

        return ans;
    }

    private List<String> find(TrieNode next) {
        if (next == null) {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        if (next.w != null) {
            ans.add(next.w);
        }
        for (int i = 0; i < 26; i++) {
            if (next.childs[i] != null) {
                List<String> res = find(next.childs[i]);
                ans.addAll(res);
                if (ans.size() >=3) {
                    break;
                }
            }
        }
        return ans;
    }

    public class TrieNode {
        String w;
        TrieNode[] childs = new TrieNode[26];
    }
}
