package vav.codility.interview;

public class Read4 {

    char cache[] = new char[4];
    int pos;

    public int read(char[] buf, int n) {
        int ind = 0;
        int limit = n;
        if (pos > 0) {
            while (pos < 4 && limit > 0) {
                buf[ind++] = cache[pos++];
                limit--;
            }
            pos = 0;
        }
        while (limit>0) {
            pos = 0;
            int r4Count = read4(cache);
            if (r4Count<4) {
                while (r4Count > 0 && limit>0) {
                    buf[ind++] = cache[pos++];
                    limit--;
                    r4Count--;
                }
                break;
            } else {
                while (pos < 4) {
                    buf[ind++] = cache[pos++];
                    limit--;
                }
            }
        }
        return ind;
    }

    private int read4(char[] buf4) {
        return 0;
    }
}
