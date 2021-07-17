package vav.codility.lists;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return addNode(l1, l2);
    }

    private ListNode addNode(ListNode l1, ListNode l2) {
        ListNode result =null;
        if (l1 != null && l2 !=null) {
            if(l1.val > l2.val) {
                result = new ListNode(l2.val);
                result.next = addNode(l1, l2.next);
            } else {
                result = new ListNode(l1.val);
                result.next = addNode(l2, l1.next);
            }
        } else if (l1 != null && l2 == null) {
            result = new ListNode(l1.val);
            result.next = addNode(l1.next, null);
        } else if (l2 != null && l1 == null) {
            result = new ListNode(l2.val);
            result.next = addNode(l2.next, null);
        }
        return result;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
