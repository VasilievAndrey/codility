package vav.codility.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new LinkedList(), ans, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> cur, List<List<Integer>> ans, boolean[] vis) {
        if (cur.size() == nums.length) {
            ans.add(cur);
        }

        for (int i=0; i<nums.length; i++) {
            if (vis[i]) continue;

            vis[i] = true;
            cur.add(nums[i]);
            backtrack(nums, cur, ans, vis);
            cur.remove(Integer.valueOf(nums[i]));
            vis[i] = false;
        }
    }
}
