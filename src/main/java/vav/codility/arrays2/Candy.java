package vav.codility.arrays2;

import java.util.Arrays;

public class Candy {

    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n < 2) {
            return n;
        }
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 0; i< n -1; i++) {
            if (ratings[i] >= ratings[i+1]) {
                continue;
            }
            candies[i+1] = candies[i] + 1;
        }

        for (int i = n -1; i>0; i--) {
            if (ratings[i] >= ratings[i-1]) {
                continue;
            }
            candies[i-1] = Math.max(candies[i] + 1, candies[i-1]);
        }

        int count = 0;
        for (int i=0; i<candies.length; i++) {
            count += candies[i];
        }

        return count;
    }
}
