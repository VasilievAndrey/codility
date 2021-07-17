package vav.codility.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePaths {

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

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<String> ans = new ArrayList<>();
        dsf(root, ans, "");
        return ans;
    }

    private void dsf(TreeNode root, List<String> ans, String cur) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            String res = cur + root.val;
            ans.add(res);
            return;
        }
        cur = cur + root.val + "->";
        dsf(root.left, ans, cur);
        dsf(root.right, ans, cur);
    }
}
