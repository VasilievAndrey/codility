package vav.codility.arrays2;

public class MatchsticksToSquare {

    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum +=matchsticks[i];
        }
        if (sum % 4 != 0) {
            return false;
        }
        int len = sum /4;
        int[] cur = new int[4];
       return dsf(0, len, cur, matchsticks);
    }

    private boolean dsf(int indx, int len, int[] cur, int[] nums) {
        if(indx >= nums.length){
            return cur[0] == cur[1] && cur[1] == cur[2] && cur[2] == len;
        }
        for(int i = 0; i < 4; i++){
            if(cur[i] + nums[indx] > len)continue;
            cur[i] += nums[indx];
            if(dsf(indx + 1, len, cur, nums)) return true;
            cur[i] -= nums[indx];
        }
        return false;
    }
}
