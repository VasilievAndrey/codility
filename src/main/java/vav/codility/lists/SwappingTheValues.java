package vav.codility.lists;

import java.util.HashMap;
import java.util.Map;

public class SwappingTheValues {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapNodes(ListNode head, int k) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode root = head;
        ListNode next = head;
        int i=0;
        while (next != null) {
            map.put(i++, next);
            next = next.next;
        }
        ListNode node1 = map.get(k-1);
        int tmp = node1.val;
        ListNode node2 = map.get(i - k);
        node1.val = node2.val;
        node2.val = tmp;
        return root;
    }
}
