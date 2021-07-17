package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayOfAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans =new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        for (Character ch: p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int n = s.length();
        Map<Character, Integer> tmp = new HashMap<>();
        Queue<Character> pq = new LinkedList<>();
        for (int i=n-1; i>=0; i--) {
            Character ch = s.charAt(i);
            if (pq.size() >= p.length()) {
                Character poll = pq.poll();
                Integer pollCount = tmp.get(poll);
                if (pollCount == 1) {
                    tmp.remove(poll);
                } else {
                    tmp.put(poll, pollCount - 1);
                }
            }
            if (map.containsKey(ch)) {
                tmp.put(ch, tmp.getOrDefault(ch, 0) +1 );
                pq.add(ch);
                boolean pass = false;
                if (tmp.size() == map.size()) {
                    for (Character key: tmp.keySet()) {
                        Integer count = map.get(key);
                        Integer countTmp =tmp.get(key);
                        if ( count <= countTmp) {
                            pass = true;
                            continue;
                        } else{
                            pass = false;
                            break;
                        }
                    }
                }
                if (pass) {
                    ans.add(i);
                }
            } else {
                tmp.clear();
                pq.clear();
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i=ans.size() -1; i>=0; i--) {
            res.add(ans.get(i));
        }
        return res;
    }
}
