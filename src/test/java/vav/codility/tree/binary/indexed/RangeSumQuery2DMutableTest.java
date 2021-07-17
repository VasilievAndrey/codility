package vav.codility.tree.binary.indexed;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQuery2DMutableTest {

    @Test
    public void test() {
        int[][] inp = new int[][] {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        RangeSumQuery2DMutable mtrx = new RangeSumQuery2DMutable(inp);
        assertEquals(8, mtrx.sumRegion(2, 1, 4, 3));
        mtrx.update(3, 2, 2);
        assertEquals(10,mtrx.sumRegion(2, 1, 4, 3));
    }

    @Test
    public void test2() {
        int[][] inp = new int[][] {{2,1,8,-3,-6,1,-3,5,3,8,-6,0,-6},
                {0,-2,-9,0,2,3,-7,-2,-1,2,-4,-1,4},
                {3,2,7,0,1,8,-1,0,6,-2,-7,-3,3},
                {2,9,-8,5,4,4,1,-6,4,-3,4,-7,0},
                {1,0,1,5,2,4,-4,-6,-1,8,6,5,5},
                {-6,-2,-1,-2,-4,-2,9,-5,-9,-5,-1,5,6},
                {-8,6,-3,-4,9,-1,-3,-6,8,3,-5,9,7},
                {-1,-7,4,-3,7,3,-7,4,-4,1,-6,5,-6},
                {7,8,6,-7,2,2,-9,0,9,-7,-6,-4,-5},
                {4,8,3,9,2,9,5,1,-5,7,6,1,8},
                {5,9,3,9,3,8,2,4,-8,-1,-8,2,3},
                {-9,-6,6,4,4,-1,8,2,3,-4,0,2,-4},
                {4,-8,-6,3,-2,3,4,5,3,-6,2,-8,-7},
                {-8,4,1,4,4,5,0,-5,4,-6,-1,0,3},
                {3,-2,8,4,1,-5,1,-6,-8,8,2,4,1},
                {-1,8,-5,-9,-5,8,-9,2,7,2,-3,-5,-9},
                {8,-5,-6,-2,4,0,-3,-5,2,2,-3,4,5},
                {0,9,6,-3,-9,0,-7,-3,-9,-5,-6,9,-2}};
        RangeSumQuery2DMutable mtrx = new RangeSumQuery2DMutable(inp);
        mtrx.update(13, 9, -6);
        assertEquals(64, mtrx.sumRegion(9,0,12,5));
        assertEquals(21,mtrx.sumRegion(11, 3, 14, 12));
    }

}
