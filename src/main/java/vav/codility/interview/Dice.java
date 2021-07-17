package vav.codility.interview;

import java.util.HashMap;
import java.util.Map;

public class Dice {

    int MOD = 1_000_000_007;
    Map<String, Integer> memo = new HashMap<>();
    public int numRollsToTarget(int d, int f, int target) {
        if (d == 0 && target == 0) {
            return 1;
        }
        if (d == 0 || target == 0) {
            return 0;
        }
        String str = d + " " + target;
        if (memo.containsKey(str)) {
            return memo.get(str);
        }
        int res = 0;
        for (int i = 1; i <= f; i++) {
            if (target <i) {
                break;
            }
            res = (res + numRollsToTarget(d - 1, f, target - i)) % MOD;
        }
        memo.put(str, res);
        return res;
    }
}
