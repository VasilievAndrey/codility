package vav.codility.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();

        ArrayDeque<TreeNode> queue = new ArrayDeque(){{ offer(root); }};
        List<Integer> rightside = new ArrayList();

        while (!queue.isEmpty()) {
            int levelLength = queue.size();

            for(int i = 0; i < levelLength; ++i) {
                TreeNode node = queue.poll();
                // if it's the rightmost element
                if (i == levelLength - 1) {
                    rightside.add(node.val);
                }

                // add child nodes in the queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return rightside;
    }
}
