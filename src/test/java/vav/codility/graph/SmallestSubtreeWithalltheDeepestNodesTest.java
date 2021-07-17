package vav.codility.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubtreeWithalltheDeepestNodesTest {

    @Test
    public void test() {
        //3,5,1,6,2,0,8,null,null,7,4
        TreeNode r4 = new TreeNode(8, null, null);
        TreeNode l4 = new TreeNode(0, null, null);
        TreeNode r3 = new TreeNode(4, null, null);
        TreeNode l3 = new TreeNode(7, null, null);
        TreeNode right2 = new TreeNode(2,l3, r3);
        TreeNode left2 = new TreeNode(6, null, null);
        TreeNode left = new TreeNode(5,left2,right2);
        TreeNode right = new TreeNode(1, l4, r4);
        TreeNode root = new TreeNode(3, left, right);

        TreeNode treeNode = new SmallestSubtreeWithalltheDeepestNodes().subtreeWithAllDeepest(root);
        assertNotNull(treeNode);
    }

    @Test
    public void test2() {
        TreeNode r2 = new TreeNode(2, null, null);
        TreeNode left = new TreeNode(3,null,null);
        TreeNode right = new TreeNode(1, null, r2);
        TreeNode root = new TreeNode(0, left, right);

        TreeNode treeNode = new SmallestSubtreeWithalltheDeepestNodes().subtreeWithAllDeepest(root);
        assertNotNull(treeNode);
    }

}
