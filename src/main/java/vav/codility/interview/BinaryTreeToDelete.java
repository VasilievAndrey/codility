package vav.codility.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinaryTreeToDelete {

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
    Set<Integer> set;
    List<TreeNode> res;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        set = new HashSet<>();
        res = new ArrayList<>();
        for (int i : to_delete)
            set.add(i);
        travers(root, true);
        return res;
    }

    private TreeNode travers(TreeNode node, boolean isRoot) {
        if (node == null) return null;
        boolean deleted = set.contains(node.val);
        if (isRoot && !deleted) res.add(node);
        node.left = travers(node.left, deleted);
        node.right =  travers(node.right, deleted);
        return deleted ? null : node;
    }
}
