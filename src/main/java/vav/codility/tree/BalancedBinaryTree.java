package vav.codility.tree;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return dsf(root, 0);
    }

    private boolean dsf(TreeNode root, int level) {

        return false;
    }
}
