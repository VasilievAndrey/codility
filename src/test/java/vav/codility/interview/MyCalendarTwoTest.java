package vav.codility.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalendarTwoTest {

    @Test
    public void test() {
        MyCalendarTwo sub = new MyCalendarTwo();
        assertTrue(sub.book(10, 20));
        assertTrue(sub.book(50, 60));
        assertTrue(sub.book(10, 40));
        assertFalse(sub.book(5, 15));
        assertTrue(sub.book(5, 10));
        assertTrue(sub.book(25, 55));
    }

    @Test
    public void test1() {

        MyCalendarTwo sub = new MyCalendarTwo();
        assertTrue(sub.book(26,35));
        assertTrue(sub.book(26,32));
        assertFalse(sub.book(25,32));
        assertTrue(sub.book(18,26));
        assertTrue(sub.book(40,45));
        assertTrue(sub.book(19,26));
        assertTrue(sub.book(48,50));
        assertTrue(sub.book(1,6));
        assertTrue(sub.book(46,50));
        assertTrue(sub.book(11,18));

    }

}
