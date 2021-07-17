package vav.codility.lists;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode next = head;
        ListNode newList = new ListNode();
        ListNode grater = new ListNode();
        ListNode graterHead = grater;
        graterHead.val = Integer.MAX_VALUE;
        ListNode ans = newList;
        ListNode prevGrater = null;
        ListNode prevSmall = null;
        while (next != null) {
            if (next.val < x) {
                newList.val = next.val;
                prevSmall = newList;
                if (next.next != null) {
                    newList.next = new ListNode();
                    newList = newList.next;
                } else {
                    if (prevGrater != null) {
                        prevGrater.next = null;
                    }
                }
            } else {
                grater.val = next.val;
                if (next.next != null) {
                    grater.next = new ListNode();
                    prevGrater = grater;
                    grater = grater.next;
                } else {
                    newList = prevSmall;
                }
            }
            next = next.next;
        }
        if (newList == null) {
            return graterHead;
        }
        if (graterHead.val == Integer.MAX_VALUE) {
            return ans;
        }
        newList.next = graterHead;
        return ans;
    }
}
