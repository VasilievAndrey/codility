package vav.codility.tree;

public class DeepestLeavesSum {
    int[] sum = new int[]{0,0};

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 0);
        return sum[1];
    }

    private void dfs(TreeNode node, int count) {
        if(node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (sum[0] < count) {
                sum[0] = count;
                sum[1] = node.val;
            } else if (sum[0] == count) {
                sum[1] += node.val;
            }
        }
        count++;
        dfs(node.left, count);
        dfs(node.right, count);
    }
}
