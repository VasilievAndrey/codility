package vav.codility.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {

    @Test
    public void test() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        int rear = myCircularQueue.Rear();// return 3
        assertTrue(myCircularQueue.isFull());   // return True
        assertTrue(myCircularQueue.deQueue());  // return True
        myCircularQueue.enQueue(4); // return True
        assertEquals(4, myCircularQueue.Rear());
    }

}
