package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntTest {

    @Test
    public void reverse() {
        assertEquals(-321,ReverseInt.reverse(-123));
    }

    @Test
    public void reverse1() {
        assertEquals(0,ReverseInt.reverse(1534236469));
    }

}
