package vav.codility.arrays.strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap();
        int n = s.length();
        for (int i=0; i<n; i++) {
            Character ch = map.get(s.charAt(i));
            if (ch == null ) {
                if (!map.values().contains(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else if (ch != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
