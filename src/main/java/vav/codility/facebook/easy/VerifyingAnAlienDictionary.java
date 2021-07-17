package vav.codility.facebook.easy;

public class VerifyingAnAlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length == 0 || order == null || order.length() == 0) {
            return false;
        }
        for (int i = 1; i < words.length; i++) {
            if (wrongOrder(words[i - 1], words[i], order)) {
                return false;
            }
        }
        return true;
    }

    private static boolean wrongOrder(String word1, String word2, String order) {
        if (word1.length() > word2.length() && word1.startsWith(word2)) {
            return true;
        }
        int i = 0;
        while (i < word1.length()) {
            int ind1 = order.indexOf(word1.charAt(i));
            int ind2 = order.indexOf(word2.charAt(i));
            if (ind1 < ind2) {
                return false;
            } else if (ind1 > ind2) {
                return true;
            }
            i++;
        }
        return false;
    }
}
