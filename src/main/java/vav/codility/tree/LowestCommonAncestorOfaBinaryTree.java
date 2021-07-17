package vav.codility.tree;

public class LowestCommonAncestorOfaBinaryTree {

    public Node lowestCommonAncestor(Node p, Node q) {
        Node p1 = p;
        Node q1 = q;
        while (p1 != q1) {
            p1 = p1.parent == null ? p1: p1.parent;
            q1 = q1.parent == null ? q1: q1.parent;
        }
        return p1;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };
}
