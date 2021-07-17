package vav.codility.arrays.strings;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TextJustification {

        public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        Queue<String> tmp = new LinkedList<>();
        List<Pair<Integer, List<String>>> str = new LinkedList<>();
        int sum = 0;
        for (String word: words) {
            if (sum == 0) {
                sum = word.length();
            } else {
                sum += 1+ word.length();
            }
            if (sum > maxWidth) {
                str.add(new Pair(sum - word.length() - 1, tmp));
                tmp = new LinkedList<>();
                tmp.add(word);
                sum = word.length();
            } else {
                tmp.add(word);
            }
        }
        if (!tmp.isEmpty()) {
            str.add(new Pair(sum, tmp));
        }
        Iterator<Pair<Integer, List<String>>> it = str.iterator();
        for (int i=0; i<str.size(); i++) {
            Pair<Integer, List<String>> next = it.next();
            boolean last = i == str.size() -1;
            ans.add(buildLine(next, last, maxWidth));
        }
        return ans;
    }

    private String buildLine(Pair<Integer, List<String>> next, boolean last, int len) {
        int sum = next.fst;
        List<String> words =next.snd;
        StringBuilder[] arr = new StringBuilder[words.size()];
        if (!last && words.size() > 1) {
            int spaces = len -sum;
            fillStringBuilders(words, arr);
            int k = 0;
            for (int j = 0; j < spaces; j++) {
                arr[k].append(" ");
                if (k == words.size() -2) {
                    k=0;
                } else {
                    k++;
                }
            }
        } else {
            fillStringBuilders(words, arr);
            for (int k=0; k< len -sum; k++) {
                arr[words.size() -1].append(" ");
            }
        }
        StringBuilder line = new StringBuilder();
        for (StringBuilder bl: arr) {
            line.append(bl.toString());
        }
        return line.toString();
    }

    private void fillStringBuilders(List<String> words, StringBuilder[] arr) {
        int i=0;
        for (String word: words) {
            if (i == words.size() -1) {
                arr[i] = new StringBuilder().append(word);
            } else {
                arr[i] = new StringBuilder().append(word).append(" ");
            }
            i++;
        }
    }

    public static class Pair<T,U> {
        public T fst;
        public U snd;

        Pair(T val, U val2) {
            this.fst = val;
            this.snd = val2;
        }
    }
}
