package vav.codility.dynamic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class JumpGameVI {

    public int maxResult(int[] nums, int k) {
        int ans = 0;
        Deque<int[]> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!dq.isEmpty() && dq.getFirst()[0] == i - k - 1) {
                dq.pollFirst();
            }
            ans = dq.isEmpty() ? nums[i] : dq.peekFirst()[1] + nums[i];
            while (!dq.isEmpty() && dq.peekLast()[1] <= ans) {
                dq.pollLast();
            }
            dq.addLast(new int[]{i, ans});
        }
        return ans;
    }
}
