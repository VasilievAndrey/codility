package vav.codility.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfBinaryTreeTest {

    @Test
    public void test() {
        DiameterOfBinaryTree subj = new DiameterOfBinaryTree();

        DiameterOfBinaryTree.TreeNode left2 = new DiameterOfBinaryTree.TreeNode(4);
        DiameterOfBinaryTree.TreeNode right2 = new DiameterOfBinaryTree.TreeNode(5, null, null);
        DiameterOfBinaryTree.TreeNode left = new DiameterOfBinaryTree.TreeNode(2, left2, right2);
        DiameterOfBinaryTree.TreeNode right = new DiameterOfBinaryTree.TreeNode(3, null, null);
        DiameterOfBinaryTree.TreeNode root = new DiameterOfBinaryTree.TreeNode(1, left, right);

        assertEquals(3, subj.diameterOfBinaryTree(root));
    }
    @Test
    public void test2() {
        DiameterOfBinaryTree subj = new DiameterOfBinaryTree();

        DiameterOfBinaryTree.TreeNode right = new DiameterOfBinaryTree.TreeNode(2, null, null);
        DiameterOfBinaryTree.TreeNode root = new DiameterOfBinaryTree.TreeNode(1, null, right);

        assertEquals(1, subj.diameterOfBinaryTree(root));
    }
}
