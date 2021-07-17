package vav.codility.tree;

public class FlattenBinaryTreeLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null &&
                root.right == null) {
            return;
        }

        if (root.left != null) {
            flatten(root.left);
            TreeNode rightTmp = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode next = root.right;
            while (next.right !=null) {
                next = root.right;
            }
            next.right = rightTmp;
        }
        flatten(root.right);
    }

}
