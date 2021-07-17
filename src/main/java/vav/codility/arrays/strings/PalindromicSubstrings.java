package vav.codility.arrays.strings;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        Queue<String> queue = new PriorityQueue<>((a,b) -> Integer.compare(b.length(), a.length()));
        for (int i=0; i< s.length(); i++) {
            for (int j =1; j<=s.length(); j++) {
                int end = i + j;
                if (end <= s.length()) {
                    String substr = s.substring(i, i + j);
                    if (isPalindrome(substr, new LinkedList<>(queue))) {
                        queue.add(substr);
                    }
                }
            }
        }
        return queue.size();
    }

    private boolean isPalindrome(String substr, Queue<String> queue) {
        while (!queue.isEmpty()) {
            String poli = queue.poll();
            if (substr.length() >3
                &&
                    substr.contains(poli) && substr.length() == poli.length() +1
                    && substr.charAt(0) == poli.charAt(0)
                        && substr.charAt(0) == substr.charAt(substr.length() -1)) {
                    String substring = substr.substring(1, substr.length() - 1);
                    return isPalindrome(substring, queue);
            }
            if (substr.contains(poli) && substr.length() == poli.length() +2
                    && substr.charAt(0) != poli.charAt(0)
                        && substr.charAt(0) == substr.charAt(substr.length() -1)) {
                return true;
            }
        }

        int left = 0;
        int right = substr.length() -1;
        while (left < right) {
            if (substr.charAt(left) != substr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
