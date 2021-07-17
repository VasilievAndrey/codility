package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    @Test
    public void test() {
        JumpGame game = new JumpGame();
        int[] nums = new int[] {2,3,1,1,4};
        assertTrue(game.canJump(nums));
    }

}
