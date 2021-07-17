package vav.codility.arrays.strings;

public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int l = s.length();
        int ans =0;
        for (int i = 0; i< l; i++) {
            int start = chars[i];
            int count =1;
            boolean sw = false;
            for (int j=i +1; j<l; j++) {
                if (chars[j] == start) {
                    count++;
                    if (sw) {
                        if (count>1) break;
                        ans++;
                        break;
                    }
                } else {
                    sw = true;
                    count--;
                    if (count == 0) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
