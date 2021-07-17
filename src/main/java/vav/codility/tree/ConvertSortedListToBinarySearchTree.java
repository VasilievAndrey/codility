package vav.codility.tree;

public class ConvertSortedListToBinarySearchTree {
    ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        h = head;
        int len = 0;
        ListNode next = head;
        while (next != null) {
            len++;
            next = next.next;
        }
        return buildBST(0, len -1);
    }

    private TreeNode buildBST(int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right )/2;
        TreeNode l = buildBST(left, mid -1);
        TreeNode node = new TreeNode(h.val);
        h = h.next;
        TreeNode r = buildBST(mid +1, right);
        node.left = l;
        node.right = r;
        return node;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
