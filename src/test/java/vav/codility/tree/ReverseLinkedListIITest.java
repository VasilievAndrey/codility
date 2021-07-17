package vav.codility.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListIITest {

    @Test
    public void test() {
        ReverseLinkedListII.ListNode five = new ReverseLinkedListII.ListNode(5, null);
        ReverseLinkedListII.ListNode four = new ReverseLinkedListII.ListNode(4, five);
        ReverseLinkedListII.ListNode three = new ReverseLinkedListII.ListNode(3, four);
        ReverseLinkedListII.ListNode two = new ReverseLinkedListII.ListNode(2, three);
        ReverseLinkedListII.ListNode root = new ReverseLinkedListII.ListNode(1, two);

        ReverseLinkedListII sub = new ReverseLinkedListII();
        sub.reverseBetween(root, 2,4);
    }
}
