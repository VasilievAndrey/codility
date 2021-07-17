package vav.codility.graph;

public class SmallestSubtreeWithalltheDeepestNodes {

    int max = Integer.MIN_VALUE;
    TreeNode ans;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null || root.right == null && root.left == null) {
            return root;
        }
        findDeep(null, root, 0);
        return ans;
    }

    private void findDeep(TreeNode parent, TreeNode node, int i) {
        if (parent == null && node == null) {
            if (i > max) {
                ans = node;
            }
            return;
        }
        if (node.left == null && node.right == null) {
            if (max < i) {
                max = i;
                ans = parent;
            }
            return;
        }
        if (node.left == null) {
            findDeep(node, node.right, i +1);
        } else if (node.right == null) {
            findDeep(node, node.left, i +1);
        } else {
            findDeep(node, node.left, i + 1);
            findDeep(node, node.right, i + 1);
        }
    }



}
