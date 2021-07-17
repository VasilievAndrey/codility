package vav.codility.arrays.strings;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        int l = indices.length;
        char[] out = new char[l];
        char[] chars = s.toCharArray();
        for (int i=0; i<l; i++) {
            out[indices[i]] = chars[i];
        }
        return String.valueOf(out);
    }
}
