package vav.codility.tree;

public class DiameterOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        int dfs = dfs(root);
        max = Math.max(dfs, max);
        return max -1;
    }

    private int dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + dfs(root.right);

        }
        if (root.right == null) {
            return 1 + dfs(root.left);

        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int local = 1 + left + right;
        max = Math.max(max, local);
        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }
}
