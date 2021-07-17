package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQuery2DImmutableTest {

    @Test
    public void test() {
        int[][] in = new int[][] {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        RangeSumQuery2DImmutable matr = new RangeSumQuery2DImmutable(in);
        assertEquals(8, matr.sumRegion(2, 1, 4, 3));
        assertEquals(11, matr.sumRegion(1, 1, 2, 2));
        assertEquals(12, matr.sumRegion(1, 2, 2, 4));
    }

}
