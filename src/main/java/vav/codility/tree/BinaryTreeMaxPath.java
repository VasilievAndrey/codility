package vav.codility.tree;


public class BinaryTreeMaxPath {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calcMaxPath(root);
        return max;
    }

    private int calcMaxPath(TreeNode node) {

        int maxLeft = calcMaxPath(node.left);
        int maxRight = calcMaxPath(node.right);
        int currentPath = node.val + maxLeft + maxRight;
        max = Math.max(currentPath, max);
        return currentPath;
    }


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
}
