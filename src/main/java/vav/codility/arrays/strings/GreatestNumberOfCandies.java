package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int n: candies) {
            max = Math.max(n,max);
        }
        for (int n: candies) {
            if (n+extraCandies >=max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
