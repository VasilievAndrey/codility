package vav.codility.tree;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        while (root.left != null || root.right != null ) {
            List<Integer> leaf = new ArrayList<>();
            travers(root,root.left, root.right, leaf);
            ans.add(leaf);
        }
        return ans;
    }

    private void travers(TreeNode parent, TreeNode left, TreeNode right, List<Integer> leaf) {
        if (parent == null) {
            return;
        }

        if (left != null) {
            if (left.left == null && left.right == null) {
                leaf.add(left.val);
                parent.left = null;
            } else {
                travers(left, left.left, left.right, leaf);
            }
        }
        if (right != null) {
            if (right.left == null && right.right == null) {
                leaf.add(right.val);
                parent.right = null;
            } else {
                travers(right, right.left, right.right, leaf);
            }
        }
    }
}
