package vav.codility.dynamic;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        int result = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                max = prices[i];
                min = prices[i];
            } else if (max < prices[i]) {
                max = prices[i];
                result = Math.max(result, max - min);
            }
        }
        return result;
    }
}
