package vav.codility.lists;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addValue(l1, l2, 0);
    }

    private ListNode addValue(ListNode l1, ListNode l2, int remainder) {
        ListNode result = new ListNode(0);
        int nextRemainder = 0;
        if (l1 != null && l2 !=null) {
            int sum = l1.val + l2.val + remainder;
            if (sum < 10) {
                result.val = sum;
            } else {
                result.val = sum % 10;
                nextRemainder = 1;
            }
            result.next = addValue(l1.next, l2.next, nextRemainder);
        } else if (l1 == null && l2 !=null) {
            getListNode(l2, remainder, result);
        } else if (l2 == null && l1 !=null) {
            getListNode(l1, remainder, result);
        } else {
            result = null;
        }
        return result;
    }

    private ListNode getListNode(ListNode l2, int remainder, ListNode result) {
        int nextRemainder = 0;
        int sum = l2.val + remainder;
        if (sum < 10) {
            result.val = sum;
        } else {
            result.val = sum % 10;
            nextRemainder = 1;
        }

        return result.next = addValue(l2.next, null, nextRemainder);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
