package vav.codility.lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> ls = new ArrayList<>();

        ListNode next = head;
        while(next != null) {
            ls.add(next);
            next = next.next;
        }
        if (ls.size() == 1 && n == 1) {
            return null;
        }

        int index = ls.size() - (n + 1);
        if (index < 0) {
                return head.next;
        }
        if (n == 1) {
            ListNode node = ls.get(ls.size() - 2);
            node.next = null;
            return  head;

        }
        ListNode node = ls.get(index);
        ListNode node2 = ls.get(ls.size() - (n -1));
        node.next = node2;
        return head;
    }
}
