package vav.codility;

public class SumXorAllSubsets {

    public int subsetXORSum(int[] nums) {

        int n = nums.length;
        int tmp = 0;
        int sum = 0;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++) {
            tmp = 0;
            for (int j = 0; j < n; j++) {
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0) {
                    tmp = tmp ^ nums[j];
                }
            }
            sum+=tmp;
        }
        return sum;
    }
}
