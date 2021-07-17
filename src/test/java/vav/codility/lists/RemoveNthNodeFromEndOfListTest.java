package vav.codility.lists;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void test() {
        ListNode node = new ListNode(2, null);
        ListNode head = new ListNode(1, node);
        ListNode listNode = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1);
        assertNotNull(listNode);
    }
    @Test
    public void test1() {
        ListNode node2 = new ListNode(3, null);
        ListNode node = new ListNode(2, node2);
        ListNode head = new ListNode(1, node);
        ListNode listNode = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1);
        assertNotNull(listNode);
    }
    @Test
    public void test2() {
        ListNode node4 = new ListNode(5, null);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        ListNode listNode = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2);
        assertNotNull(listNode);
    }

}
