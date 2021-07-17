package vav.codility.tree;

public class LowestCommonAncestorOfaBinaryTree2 {

    public Node lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode next = root;
        Node link = new Node(next, null);
        while(next != null) {
//            next = next.
        }
        return null;
    }

    class Node {
        TreeNode node;
        Node parent;

        public Node(TreeNode node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    };
}
