package vav.codility.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloneGraph {

    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node fromMap = map.get(node);
        if (fromMap != null) {
            return fromMap;
        }
        Node res = new Node();

        res.val = node.val;
        map.put(node, res);
        res.neighbors = node.neighbors.stream().map(item ->
                cloneGraph(item)).collect(Collectors.toList());
        return res;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
