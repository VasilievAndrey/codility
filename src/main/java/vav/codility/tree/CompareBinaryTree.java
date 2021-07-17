package vav.codility.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CompareBinaryTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i=0; i<s; i++) {
                TreeNode node = q.poll();
                if (compare(node, subRoot)) {
                    return true;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        return false;
    }

    private boolean compare(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null && subRoot !=null) {
            return false;
        } else if (root != null && subRoot == null) {
            return false;
        } else {
            if (root.val != subRoot.val) {
                return false;
            } else {
                return compare(root.left, subRoot.left) && compare(root.right, subRoot.right);
            }
        }
    }
}
