package vav.codility.tree;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    public static boolean checkOnesSegment(String s) {
            char[] chars = s.toCharArray();
            boolean prev = true;
            for (char ch: chars) {
                if (ch == '1') {
                    if (!prev) {
                        return false;
                    }
                } else {
                    prev = false;
                }
            }
            return true;
    }
}
