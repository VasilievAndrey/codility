package vav.codility.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);

        while (!Q.isEmpty()) {
            for (int i = 0; i < Q.size(); i++) {
                Node node = Q.remove();
                if (node == null) {
                    break;
                }
                if (node.right != null) {
                    node.right.next = find(node);
                }
                if (node.left != null) {
                    node.left.next = (node.right != null) ? node.right : find(node);
                }
                Q.add(node.right);
            }
        }
        return root;
    }

    public Node find(Node node) {
        while (node.next != null) {
            node = node.next;
            if (node.left != null) {
                return node.left;
            }
            if (node.right != null) {
                return node.right;
            }
        }
        return null;
    }
}
