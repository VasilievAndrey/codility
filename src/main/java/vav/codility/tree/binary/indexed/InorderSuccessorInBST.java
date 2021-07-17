package vav.codility.tree.binary.indexed;

import java.util.Set;
import java.util.TreeSet;

public class InorderSuccessorInBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        TreeNode left = inorderSuccessor(root.left, p);
        TreeNode right = inorderSuccessor(root.right, p);
        if (root.val > p.val) {
            TreeNode res1 = compare(root, left);
            TreeNode res2 = compare(root, right);
            return compare(res1, res2);
        } else {
            return compare(left, right);
        }
    }

    private TreeNode compare(TreeNode left, TreeNode right) {
        if (left == null) {
            return  right;
        }
        if (right == null) {
            return left;
        }

        return left.val > right.val ? right: left;
    }
}
