package vav.codility.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MoveSubTreeofNAryTree {

    public Node moveSubTree(Node root, Node p, Node q) {
        //Check if p child of q
        for (Node node: q.children) {
            if (node == p) {
                return root;
            }
        }

        Node parentQ = findParent(p, q);
        if (parentQ != null) {
            parentQ.children.remove(q);
            if (q.children == null) {
                q.children = new ArrayList<>();
            }
            q.children.add(p);
            Node parentP = findParent(root, p);
            if (parentP != null) {
                parentP.children.remove(p);
                parentP.children.add(q);
            }
        } else {
            Node parentP = findParent(q, p);
            if (parentP != null && q != parentP) {
                parentP.children.remove(p);
                if (q.children == null) {
                    q.children = new ArrayList<>();
                }
                q.children.add(p);
            } else {
                Node rootParet = findParent(root, p);
                if (rootParet != null) {
                    rootParet.children.remove(p);
                    if (q.children == null) {
                        q.children = new ArrayList<>();
                    }
                    q.children.add(p);
                }
            }
        }
        return root;
    }

    private Node findParent(Node root, Node p) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                Node poll = q.poll();
                if (poll.children != null) {
                    for (Node n : poll.children) {
                        if (n == p) {
                            return poll;
                        }
                        q.add(n);
                    }
                }
            }
        }
        return null;
    }
}
