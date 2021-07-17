package vav.codility.arrays.strings;

import org.junit.Test;
import vav.codility.tree.binary.indexed.RangeSumQueryMutable;

import static org.junit.Assert.*;

public class RangeSumQueryImmutableTest {

    @Test
    public void test() {
        int[] in = new int[] {-2,0,3,-5,2,-1};
        RangeSumQueryImmutable arr = new RangeSumQueryImmutable(in);
        assertEquals(1, arr.sumRange(0,2) );
        assertEquals(-1, arr.sumRange(2,5));
        assertEquals(-3, arr.sumRange(0,5));
    }

}
