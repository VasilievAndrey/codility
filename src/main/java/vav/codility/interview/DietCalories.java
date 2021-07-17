package vav.codility.interview;

public class DietCalories {

    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int[] dp = new int[calories.length];
        for(int i = 0; i < dp.length; i++){
            if(i == 0) dp[i] = calories[i];
            else{
                dp[i] += dp[i-1] + calories[i];
            }
        }

        int res = 0;
        for(int i = 0; i <= dp.length - k; i++){
            int tmp = 0;
            if(i == 0){
                tmp = dp[k-1];
            }else{
                tmp = dp[i+k-1] - dp[i - 1];
            }
            if(tmp > upper) res++;
            else if(tmp < lower) res--;
        }
        return res;
    }
}
