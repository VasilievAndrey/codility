package vav.codility.arrays.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CrackingTheSafe {

    public String crackSafe(int n, int k) {
        String str = String.join("", Collections.nCopies(n -1, "0"));
        StringBuilder ans = new StringBuilder(str);
        Set<String> vis = new HashSet<>();
        int target = (int) Math.pow(k,n);
        dfs(ans, vis, target, n, k);
        return ans.toString();
    }

    private boolean dfs(StringBuilder bl, Set<String> vis, int target, int n, int k) {
        if (vis.size() == target) {
            return true;
        }

        String token = bl.substring(bl.length() - n + 1);
        for (char ch = '0'; ch < '0' + k; ch++) {
            String word = token + ch;
            if (vis.contains(word)) {
                continue;
            }
            bl.append(ch);
            vis.add(word);
            if (dfs(bl, vis, target, n, k)) {
                return true;
            }
            vis.remove(word);
            bl.deleteCharAt(bl.length() -1);
        }
        return false;
    }
}
