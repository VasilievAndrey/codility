package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringTest {
    @Test
    public void test2() {
        DecodeString subj = new DecodeString();
        assertEquals("accaccacc", subj.decodeString("3[a2[c]]"));
    }

    @Test
    public void test() {
        DecodeString subj = new DecodeString();
        assertEquals("aaabcbc", subj.decodeString("3[a]2[bc]"));
    }
    @Test
    public void test3() {
        DecodeString subj = new DecodeString();
        assertEquals("abcabccdcdcdef", subj.decodeString("2[abc]3[cd]ef"));
    }
}
