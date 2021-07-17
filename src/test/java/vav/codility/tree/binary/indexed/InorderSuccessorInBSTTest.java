package vav.codility.tree.binary.indexed;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InorderSuccessorInBSTTest {

    @Test
    public void test() {
        InorderSuccessorInBST subj = new InorderSuccessorInBST();

        InorderSuccessorInBST.TreeNode left = new InorderSuccessorInBST.TreeNode(1);
        InorderSuccessorInBST.TreeNode right = new InorderSuccessorInBST.TreeNode(3);
        InorderSuccessorInBST.TreeNode root = new InorderSuccessorInBST.TreeNode(2);
        root.left = left;
        root.right = right;

        InorderSuccessorInBST.TreeNode act = subj.inorderSuccessor(root, new InorderSuccessorInBST.TreeNode(1));
        assertThat(act).isEqualTo(root);
    }

}
