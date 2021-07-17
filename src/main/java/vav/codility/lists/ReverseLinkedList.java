package vav.codility.lists;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode res = null;
        ListNode cur = head;
        while (cur.next !=null) {
            ListNode next = cur.next;
            cur.next =res;
            res = cur;
            cur = next;
        }
        return res;
    }
}
