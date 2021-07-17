package vav.codility.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator {

    Queue<Integer> q = new LinkedList<>();
    TreeNode root;
    public BSTIterator(TreeNode root) {
        root = root;
        TreeNode next = root;

    }
    private void bsf(TreeNode root, Queue<Integer> q) {
        if (root == null) {
            return;
        }
        bsf(root.left, q);
        q.add(root.val);
        bsf(root.right, q);
    }

    public int next() {
        return q.poll();
    }

    public boolean hasNext() {
        return !q.isEmpty();
    }
}
