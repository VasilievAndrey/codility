package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CanJumpTest {

    @Test
    public void canJump5() {
        int[] nums = {2,5,0,0};
        assertTrue(new CanJump().canJump(nums));
    }
    @Test
    public void canJump() {
        int[] nums = {2,3,1,1,4};
        assertTrue(new CanJump().canJump(nums));
    }

    @Test
    public void canJump2() {
        int[] nums = {2,0};
        assertTrue(new CanJump().canJump(nums));
    }

    @Test
    public void canJump4() {
        int[] nums = {1,2};
        assertTrue(new CanJump().canJump(nums));
    }

    @Test
    public void canJump3() {
        int[] nums = {1};
        assertTrue(new CanJump().canJump(nums));
    }

}
