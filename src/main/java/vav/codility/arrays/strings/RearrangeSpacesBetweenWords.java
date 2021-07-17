package vav.codility.arrays.strings;

import java.util.LinkedList;
import java.util.List;

public class RearrangeSpacesBetweenWords {

    public String reorderSpaces(String text) {
        char[] chars = text.toCharArray();
        int sp =0;
        StringBuilder bl = new StringBuilder();
        List<StringBuilder> ls = new LinkedList();
        for (char ch: chars) {
            if (ch == ' ') {
                if (bl.length() > 0) {
                    ls.add(bl);
                    bl = new StringBuilder();
                }
                sp++;
            } else {
                bl.append(ch);
            }
        }
        if (bl.length() > 0) {
            ls.add(bl);
        }
        int toAdd = 0;
        if (ls.size() > 1) {
            toAdd = sp / (ls.size() -1);
        }
        StringBuilder space = new StringBuilder();
        for (int i=0; i< toAdd; i++) {
            space.append(" ");
        }
        int suf = 0;
        if (ls.size() > 1) {
            suf = sp % (ls.size() -1);
        } else {
            suf = sp;
        }
        StringBuilder suffix = new StringBuilder();
        for (int i=0; i< suf; i++) {
            suffix.append(" ");
        }

        StringBuilder ans = new StringBuilder();
        int i =0;
        for (StringBuilder word: ls) {
            if (i == ls.size() -1) {
                ans.append(word);
                ans.append(suffix);
            } else {
                ans.append(word);
                ans.append(space);
            }
            i++;
        }
        return ans.toString();
    }
}
