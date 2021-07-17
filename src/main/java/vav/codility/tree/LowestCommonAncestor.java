package vav.codility.tree;

public class LowestCommonAncestor {

    public class TreeNode {
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

    TreeNode ans;
    int max = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == rightHeight) {
            return root;
        } else if (leftHeight < rightHeight) {
            return lcaDeepestLeaves(root.right);
        } else {
            return lcaDeepestLeaves(root.left);
        }
    }

    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (node.left != null) {
            leftHeight = getHeight(node.left);
        }
        if (node.right != null) {
            rightHeight = getHeight(node.right);
        }

        int height = 1 + Math.max(leftHeight, rightHeight);

        return height;

    }
}
