package vav.codility.tree;

import vav.codility.lists.ListNode;

public class ReverseLinkedListII {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //find left
        ListNode root = head;
        ListNode next = head;
        ListNode parent = null;
        while (next != null && next.val != left) {
            parent = next;
            next = next.next;
        }

        if (next.val == left) {
            parent.next = revers(parent, right);
        }
        return root;
    }

    private ListNode revers(ListNode node, int right) {
        ListNode next = null;
        ListNode cur = node;
        ListNode prev = null;
        boolean stop = false;
        while (cur!= null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            if (stop) break;
            if (cur.val == right) {
                stop = true;
                break;

            }
        }
//        node.next = cur;
        return prev;
    }
}
