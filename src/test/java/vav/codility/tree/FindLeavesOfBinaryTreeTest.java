package vav.codility.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FindLeavesOfBinaryTreeTest {

    @Test
    public void test() {
        TreeNode left = new TreeNode(2,new TreeNode(4), new TreeNode(5));
        TreeNode root = new TreeNode(1, left, new TreeNode(3));

        FindLeavesOfBinaryTree sub = new FindLeavesOfBinaryTree();
        List<List<Integer>> leaves = sub.findLeaves(root);
        assertNotNull(leaves);

    }

}
