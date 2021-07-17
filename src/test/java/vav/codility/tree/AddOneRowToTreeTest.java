package vav.codility.tree;

import org.junit.Test;

public class AddOneRowToTreeTest {

    @Test
    public void addOneRow() {
        AddOneRowToTree.TreeNode left2 =  new AddOneRowToTree.TreeNode(3, null, null);
        AddOneRowToTree.TreeNode right2 =  new AddOneRowToTree.TreeNode(1, null, null);
        AddOneRowToTree.TreeNode left =  new AddOneRowToTree.TreeNode(2, left2, right2);
        AddOneRowToTree.TreeNode left3 =  new AddOneRowToTree.TreeNode(5, null, null);
        AddOneRowToTree.TreeNode right =  new AddOneRowToTree.TreeNode(6, left3, null);
        AddOneRowToTree.TreeNode root = new AddOneRowToTree.TreeNode(4, left, right);
        AddOneRowToTree.TreeNode treeNode = AddOneRowToTree.addOneRow(root, 1, 2);
    }

    @Test
    public void addOneRow2() {
        AddOneRowToTree.TreeNode left2 =  new AddOneRowToTree.TreeNode(3, null, null);
        AddOneRowToTree.TreeNode right2 =  new AddOneRowToTree.TreeNode(1, null, null);
        AddOneRowToTree.TreeNode left =  new AddOneRowToTree.TreeNode(2, left2, right2);
        AddOneRowToTree.TreeNode left3 =  new AddOneRowToTree.TreeNode(5, null, null);
        AddOneRowToTree.TreeNode right =  new AddOneRowToTree.TreeNode(6, left3, null);
        AddOneRowToTree.TreeNode root = new AddOneRowToTree.TreeNode(4, left, right);
        AddOneRowToTree.TreeNode treeNode = AddOneRowToTree.addOneRow(root, 1, 3);
    }

}
