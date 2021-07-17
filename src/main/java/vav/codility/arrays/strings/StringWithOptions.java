package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringWithOptions {

    public String[] expand(String s) {
        if (s.length() < 2) {
            return new String[] {s};
        }
        char[] chs = s.toCharArray();
        List<StringBuilder> ans = new ArrayList();
        for (int i=0; i<chs.length; i++) {
            List<String> options = new ArrayList<>();
            if (chs[i] == '}') {
                continue;
            }
            if (chs[i] == '{') {
                i++;
                StringBuilder bl = new StringBuilder();
                while(chs[i] != '}') {
                    if (chs[i] == ',') {
                        options.add(bl.toString());
                        bl = new StringBuilder();
                    } else {
                        bl.append(chs[i]);
                    }
                    i++;
                }
                if (bl.length() > 0) {
                    options.add(bl.toString());
                }
                if (ans.isEmpty()) {
                    for (String str: options) {
                        ans.add(new StringBuilder(str));
                    }
                } else {
                    List<StringBuilder> tmp = new ArrayList<>();
                    for (StringBuilder b: ans) {
                        for (String str: options) {
                            StringBuilder newBuild =  new StringBuilder(b).append(str);
                            tmp.add(newBuild);
                        }
                    }
                    ans = tmp;
                }
            } else {
                if (ans.isEmpty()) {
                    StringBuilder b = new StringBuilder().append(chs[i]);
                    ans.add(b);
                } else {
                    for (StringBuilder bl: ans) {
                        bl.append(chs[i]);
                    }
                }
            }
        }

        String[] arr = ans.stream().map(StringBuilder::toString).toArray(String[]::new);
        Arrays.sort(arr);
        return arr;
    }
}
