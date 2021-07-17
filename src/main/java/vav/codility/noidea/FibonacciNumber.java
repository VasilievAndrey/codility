package vav.codility.noidea;

public class FibonacciNumber {

    public int fib(int n) {
        double sqrt5 = Math.sqrt(5);
        double golden_r = (1 + sqrt5)/2;
        return Double.valueOf(Math.round(Math.pow(golden_r, n)/sqrt5)).intValue();
    }
}
