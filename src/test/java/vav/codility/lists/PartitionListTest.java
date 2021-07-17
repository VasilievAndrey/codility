package vav.codility.lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionListTest {

    @Test
    public void test() {

        ListNode sixth = new ListNode(2);
        ListNode fifth = new ListNode(5, sixth);
        ListNode fourth = new ListNode(2, fifth);
        ListNode third = new ListNode(3,fourth);
        ListNode sec = new ListNode(4,third);
        ListNode head = new ListNode(1,sec);

        ListNode partition = new PartitionList().partition(head, 3);
        assertNotNull(partition);
    }
     @Test
    public void test2() {

        ListNode sixth = new ListNode(2);
        ListNode fifth = new ListNode(5, sixth);
        ListNode fourth = new ListNode(0, fifth);
        ListNode third = new ListNode(3,fourth);
        ListNode sec = new ListNode(4,third);
        ListNode head = new ListNode(1,sec);

        ListNode partition = new PartitionList().partition(head, 2);
        assertNotNull(partition);
    }
     @Test
    public void test3() {

        ListNode head = new ListNode(1);

        ListNode partition = new PartitionList().partition(head, 0);
        assertNotNull(partition);
    }
     @Test
    public void test4() {

        ListNode head = new ListNode(1);

        ListNode partition = new PartitionList().partition(head, 2);
        assertNotNull(partition);
    }
}
