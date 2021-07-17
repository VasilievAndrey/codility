package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMedianFromDataStreamTest {

    @Test
    public void test() {
        FindMedianFromDataStream sub = new FindMedianFromDataStream();
        sub.addNum(1);
        sub.addNum(2);
        assertEquals(1.5, sub.findMedian(), 0.00001);
        sub.addNum(3);
        assertEquals(2, sub.findMedian(), 0.000001);
    }

    @Test
    public void test2() {
        FindMedianFromDataStream sub = new FindMedianFromDataStream();
        sub.addNum(6);
        assertEquals(6.0, sub.findMedian(), 0.0001);
        sub.addNum(10);
        assertEquals(8, sub.findMedian(), 0.00001);
        sub.addNum(2);
        assertEquals(6, sub.findMedian(), 0.000001);
        sub.addNum(6);
        assertEquals(6, sub.findMedian(), 0.000001);
        sub.addNum(5);
        assertEquals(6.0, sub.findMedian(), 0.000001);
        sub.addNum(0);
        assertEquals(5.5, sub.findMedian(), 0.000001);
        sub.addNum(6);
        assertEquals(6.0, sub.findMedian(), 0.000001);
        sub.addNum(3);
        assertEquals(5.5, sub.findMedian(), 0.000001);
        sub.addNum(1);
        assertEquals(5.0, sub.findMedian(), 0.000001);
        sub.addNum(0);
        assertEquals(4.0, sub.findMedian(), 0.000001);
        sub.addNum(0);
        assertEquals(3.0, sub.findMedian(), 0.000001);
    }

}
