package vav.codility.facebook;

public class UniformIntegers {

    private boolean isUniform(long a) {
        long prev = Long.MIN_VALUE;
        while (a > 0) {
            if (prev == Long.MIN_VALUE) {
                prev = a %10;
            }
            if (prev != a % 10) {
                return false;
            }
            a /=10;
        }
        return true;
    }

    public int getUniformIntegerCountInInterval(long A, long B) {
        // Write your code here
        int ans = 0;
        if (A == B) {
            return 1;
        }
        if (isUniform(A)) {
            ans +=1;
        }
        if (isUniform(B)) {
            ans +=1;
        }
        int st = 0;
        long tmp = A;
        long prev = 0;
        while (tmp >0) {
            st++;
            prev = tmp;
            tmp /=10;
        }
        int end = 0;
        tmp = B;
        long prevB = 0;
        while (tmp >0) {
            end++;
            prevB = tmp;
            tmp /=10;
        }
        if (end == st) {
            return (int) (prevB - (prev -1));
        }
        return (int)((end -st -1) * 9  + (9 - (prev -1))  + prevB);
    }


}
