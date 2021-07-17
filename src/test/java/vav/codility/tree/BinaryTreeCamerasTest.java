package vav.codility.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeCamerasTest {

    @Test
    public void test() {
        TreeNode left3 = new TreeNode(0, null, null);
        TreeNode right2 = new TreeNode(0, left3, null);
        TreeNode left2 = new TreeNode(0, null, right2);
        TreeNode right = new TreeNode(0, left2, null);
        TreeNode left = new TreeNode(0, null, right);
        TreeNode root = new TreeNode(0, left, null);

        assertEquals(2, new BinaryTreeCameras().minCameraCover(root));
    }

    @Test
    public void test2() {
        TreeNode left3 = new TreeNode(0, null, null);
        TreeNode left2 = new TreeNode(0, left3,null);
        TreeNode left = new TreeNode(0, left2, null);
        TreeNode root = new TreeNode(0, left, null);

        assertEquals(2, new BinaryTreeCameras().minCameraCover(root));
    }
    @Test
    public void test3() {
        TreeNode root = new TreeNode(0, null, null);

        assertEquals(1, new BinaryTreeCameras().minCameraCover(root));
    }

    @Test
    public void test4() {
        TreeNode right4 = new TreeNode(0, null, null);
        TreeNode right3 = new TreeNode(0, null, right4);
        TreeNode left = new TreeNode(0, null, right3);
        TreeNode right2 = new TreeNode(0, null, null);
        TreeNode right = new TreeNode(0, null, right2);
        TreeNode root = new TreeNode(0, left, right);

        assertEquals(2, new BinaryTreeCameras().minCameraCover(root));
    }

    @Test
    public void test6() {
        assertEquals(1, 1<<5);
    }
}
