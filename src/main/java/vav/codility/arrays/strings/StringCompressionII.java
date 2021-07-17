package vav.codility.arrays.strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class StringCompressionII {

    public int getLengthOfOptimalCompression(String s, int k) {
        if (s.length() < 3) {
            int ans = s.length() - k;
            return ans < 0 ? 0 : ans;
        }
        Queue<Pair> q = new PriorityQueue<>((a, b) -> a.count - b.count);
        int count = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                q.add(new Pair(chars[i - 1], count));
                count = 1;
            }
        }
        q.add(new Pair(chars[chars.length - 1], count));
        while (k > 0) {
            if (q.isEmpty()) {
                break;
            }
            if (q.peek().count == 1) {
                q.poll();
                k--;
            } else {
                Pair poll = q.poll();
                if (poll.count - k <= 0) {
                    k -= poll.count;
                } else {
                    q.add(new Pair(poll.ch, poll.count - k));
                }
            }
        }
        int ans = 0;
        for (Pair p : q) {
            if (p.count == 1) {
                ans++;
            } else {
                int len = 0;
                while (p.count > 0) {
                    p.count = p.count / 10;
                    len++;
                }
                ans += len + 1;
            }
        }
        return ans;
    }

    public static class Pair {
        Character ch;
        int count;

        public Pair(Character ch, int count) {
            this.ch = ch;
            this.count = count;
        }

        public Character getCh() {
            return ch;
        }

        public int getCount() {
            return count;
        }
    }
}
