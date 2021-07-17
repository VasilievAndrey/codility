package vav.codility.noidea;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfThreeTest {

    @Test
    public void test() {
        assertTrue(new PowerOfThree().isPowerOfThree(-3));
        assertTrue(new PowerOfThree().isPowerOfThree(9));
        assertTrue(new PowerOfThree().isPowerOfThree(27));
        assertFalse(new PowerOfThree().isPowerOfThree(0));
    }
}
