package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void test() {
        ReverseString sub = new ReverseString();
        char[] in = new char[]{'h', 'e', 'l', 'l', 'o'};
        sub.reverseString(in);
        assertNotNull(in);
    }
}
