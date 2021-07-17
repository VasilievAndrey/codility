package vav.codility.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTriples {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    if (hasDub(ans, nums[i], nums[left], nums[right])) {
                        left++;
                        continue;
                    }
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

    private boolean hasDub(List<List<Integer>> ans, int a, int b, int c) {
        for (List<Integer> l: ans) {
            if (l.contains(a) && l.contains(b) && l.contains(c) )
                return true;
        }
        return false;
    }
}
