package vav.codility.lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    @Test
    public void test() {
        PalindromeLinkedList.ListNode next = new PalindromeLinkedList.ListNode(2, null);
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, next);
        assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }

}
