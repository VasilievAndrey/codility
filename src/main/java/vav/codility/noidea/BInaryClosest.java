package vav.codility.noidea;

public class BInaryClosest {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    private double minDiff = Integer.MAX_VALUE;
    private int value = -1;

    public int closestValue(TreeNode root, double target) {
        dsf(root, target);
        return value;
    }

    private void dsf(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        double dif = Math.abs(root.val - target);
        if (minDiff > dif) {
            minDiff = dif;
            value = root.val;
        }
        dsf(root.left, target);
        dsf(root.right, target);
    }
}
