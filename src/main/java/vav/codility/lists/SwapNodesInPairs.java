package vav.codility.lists;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head;
        while (next != null && next.next != null) {
            int val = next.val;
            next.val = next.next.val;
            next.next.val = val;
            next = next.next.next;
        }
        return head;
    }
}
