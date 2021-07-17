package vav.codility.noidea;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n==0 || n <0) return false;
        while (n>1) {
            if (n%3 == 0) {
                n = n/3;
            } else {
                return false;
            }
        }
        return true;
    }
}
