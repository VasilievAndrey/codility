package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGame2Test {

    @Test
    public void test0() {
        assertEquals(2,new JumpGame2().jump(new int[] {1,2,0,1}));
    }
    @Test
    public void test() {
        assertEquals(2,new JumpGame2().jump(new int[] {2,3,1,1,4}));
    }
    @Test
    public void test1() {
        assertEquals(1,new JumpGame2().jump(new int[] {1,2}));
    }

}
