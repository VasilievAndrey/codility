package vav.codility.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        travers(root, ans);
//        TreeNode res = new TreeNode(ans.get(0));
//        TreeNode next = new TreeNode();
//        res.right = next;
//        for (int i=1; i<ans.size(); i++) {
//            next.val = ans.get(i);
//            if (i < ans.size() -1) {
//                next.right = new TreeNode();
//                next = next.right;
//            }
//        }
        return ;
    }

    private void travers(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        travers(root.left, ans);
        ans.add(root.val);
        travers(root.right, ans);
    }
}
