package vav.codility.interview;

public class StockMaxProfit {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxProf = 0;
        int min = prices[0];
        int prev = prices[0];
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < prev) {
                min = Math.min(min, prices[i]);
            } else {
                maxProf = Math.max(maxProf, prices[i] -min);
            }
            prev = prices[i];
        }
        return maxProf;
    }
}
