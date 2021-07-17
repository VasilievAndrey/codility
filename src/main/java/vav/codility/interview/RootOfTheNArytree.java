package vav.codility.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RootOfTheNArytree {

    class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public Node findRoot(List<Node> tree) {
        if (tree == null || tree.size() == 0) {
            return null;
        }

        Set<Node> seen = new HashSet<>();
        for (Node node : tree) {
            for (Node child : node.children) {
                seen.add(child);
            }
        }

        for (Node node : tree) {
            if (!seen.contains(node)) {
                return node;
            }
        }

        return null;
    }
}
