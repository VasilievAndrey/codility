package vav.codility.arrays.strings;

public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        char[] ch3 = s3.toCharArray();
        return dfs(ch1, ch2, ch3, 0,0,0);
    }

    private boolean dfs(char[] ch1, char[] ch2, char[] ch3, int i, int i1, int i2) {
        if (i2 >= ch3.length) {
            return true;
        }
        return (i<ch1.length && ch1[i] == ch3[i2] && dfs(ch1,ch2,ch3, i+1, i1, i2+1))
                || (i1 < ch2.length && ch2[i1] == ch3[i2] && dfs(ch1,ch2,ch3, i, i1+1, i2+1));
    }
}
