package vav.codility.tree;

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree {

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

    public static TreeNode addOneRow(TreeNode root, int v, int d) {
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        int level = 1;
        while (level < d -1) {

            int size = Q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = Q.poll();
                if (node.left != null) {
                    Q.add(node.left);
                }
                if (node.right != null) {
                    Q.add(node.right);
                }
            }
            level++;
        }

        if (d > 1) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = Q.poll();
                TreeNode left = node.left;
                node.left = new TreeNode(v, left, null);
                TreeNode right = node.right;
                node.right = new TreeNode(v, null, right);
            }
        } else if (d == 1) {
            root = new TreeNode(v, root, null);
        }
        return root;
    }
}
