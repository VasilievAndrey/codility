package vav.codility.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    @Test
    public void test() {

        TreeNode left = new TreeNode(4, null, null);
        TreeNode left2 = new TreeNode(3, null, null);
        TreeNode right2 = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(6, left2, right2);
        TreeNode root = new TreeNode(5, left, right);
        assertFalse(new ValidateBinarySearchTree().isValidBST(root));
    }

}
