package vav.codility.tree.binary.indexed;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQueryMutableTest {

    @Test
    public void test() {
        int[] nums = new int[] {1,3,5};
        RangeSumQueryMutable arr = new RangeSumQueryMutable(nums);
        assertEquals(9,arr.sumRange(0,2));
        arr.update(1,2);
        assertEquals(8,arr.sumRange(0,2));
    }

    @Test
    public void test2() {
        int[] nums = new int[] {-1};
        RangeSumQueryMutable arr = new RangeSumQueryMutable(nums);
        assertEquals(-1,arr.sumRange(0,0));
        arr.update(0,1);
        assertEquals(1,arr.sumRange(0,0));
    }



}
