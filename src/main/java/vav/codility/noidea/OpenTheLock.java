package vav.codility.noidea;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Queue<char[]> q = new LinkedList<>();
        char[] chs = new char[target.length()];
        Set<String> set = new HashSet<>();
        for (int i=0; i<deadends.length; i++) {
            set.add(deadends[i]);
        }
        Arrays.fill(chs, '0');
        q.add(chs);
        int count = 0;
        Set<String> vis = new HashSet<>();
        while (!q.isEmpty()) {
            int s = q.size();
            boolean pass = false;
            for (int i=0; i<s; i++) {
                char[] poll = q.poll();
                if (set.contains(String.copyValueOf(poll)) || vis.contains(String.copyValueOf(poll))) {
                    continue;
                }
                if (target.equals(String.copyValueOf(poll))) {
                    return count;
                }
                pass = true;
                vis.add(String.copyValueOf(poll));
                for (int j=0; j<target.length(); j++) {
                    char[] add = poll.clone();
                    char up = (char)(((add[j] - '0') +1) %10 + '0');
                    char down = (char)(((add[j] -'0') +9) %10 + '0');
                    add[j] = up;
                    if (!set.contains(add) && !vis.contains(String.copyValueOf(add))) {
                        q.add(add);
                        add = poll.clone();
                    }
                    add[j] = down;
                    if (!set.contains(add) && !vis.contains(String.copyValueOf(add))) {
                        q.add(add);
                    }
                }
            }
            if (pass) {
                count++;
            }
        }
        return -1;
    }
}
