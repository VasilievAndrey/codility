package vav.codility.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TreePreorderTraversalTest {

    @Test
    public void test() {
        Node root = new Node(1);
        List<Integer> preorder = new TreePreorderTraversal().preorder(root);
        assertNotNull(preorder);
    }

}
