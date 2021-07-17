package vav.codility.arrays.strings;

public class MinimumElementsToAddToFormAGivenSum {

    public static int minElements(int[] nums, int limit, int goal) {
        long curSum = 0;
        for (int i:nums) {
            curSum =curSum + i;
        }

        long total = goal - curSum;
        long res = Math.abs(total/ limit);
        if (total % limit == 0) {
            return Long.valueOf(res).intValue();
        } else {
            return Long.valueOf(res).intValue() +1;
        }
    }
}
