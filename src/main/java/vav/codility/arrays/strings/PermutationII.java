package vav.codility.arrays.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PermutationII {

    private List<List<Integer>> ans = new ArrayList<>();
    private int[] inp;
    private Map<Integer, Integer> map = new HashMap<>();

    public List<List<Integer>> permuteUnique(int[] input) {
        inp = input;
        for (int n : input) {
            map.compute(n, (k, v) -> v == null ? 1 : ++v);
        }
        dfs(new LinkedList<>());
        return ans;
    }

    private void dfs(LinkedList<Integer> arr) {
        if (arr.size() == inp.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            Integer num = ent.getKey();
            Integer value = ent.getValue();
            if (value == 0) {
                continue;
            }
            map.put(num, value -1);
            arr.addLast(num);
            dfs(arr);
            arr.removeLast();
            map.put(num, value);
        }
    }


    public static class Solution {

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> results = new ArrayList<>();

            // count the occurrence of each number
            HashMap<Integer, Integer> counter = new HashMap<>();
            for (int num : nums) {
                if (!counter.containsKey(num))
                    counter.put(num, 0);
                counter.put(num, counter.get(num) + 1);
            }

            LinkedList<Integer> comb = new LinkedList<>();
            this.backtrack(comb, nums.length, counter, results);
            return results;
        }

        protected void backtrack(
                LinkedList<Integer> comb,
                Integer N,
                HashMap<Integer, Integer> counter,
                List<List<Integer>> results) {

            if (comb.size() == N) {
                // make a deep copy of the resulting permutation,
                // since the permutation would be backtracked later.
                results.add(new ArrayList<Integer>(comb));
                return;
            }

            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                Integer num = entry.getKey();
                Integer count = entry.getValue();
                if (count == 0)
                    continue;
                // add this number into the current combination
                comb.addLast(num);
                counter.put(num, count - 1);

                // continue the exploration
                backtrack(comb, N, counter, results);

                // revert the choice for the next exploration
                comb.removeLast();
                counter.put(num, count);
            }
        }
    }
}
