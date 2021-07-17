package vav.codility.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLagestValueOnLevel {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()) {
            int size = Q.size();
            int max = Integer.MIN_VALUE;
            for (int i=0; i<size; i++) {
                TreeNode poll = Q.poll();
                max = Math.max(max, poll.val);
                if (poll.left != null) {
                    Q.add(poll.left);
                }
                if (poll.right != null) {
                    Q.add(poll.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
