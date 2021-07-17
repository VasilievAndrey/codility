package vav.codility.tree;

import java.util.LinkedList;
import java.util.List;

public class TreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        travers(root, ans);
        return ans;
    }

    private void travers(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        if (root.children !=null) {
            for (Node node: root.children) {
                travers(node, ans);
            }
        }
    }
}
