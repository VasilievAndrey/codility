package vav.codility.tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {

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

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int val: list) {
            cur.right = new TreeNode(val);
            cur = cur.right;
        }
        return ans.right;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
