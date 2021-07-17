package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordFilterTest {

    @Test
    public void test() {
        String[] arr = new String[] {"apple"};
        WordFilter wordFilter = new WordFilter(arr);
        assertEquals(0, wordFilter.f("a", "e"));

    }

    @Test
    public void test2() {
        String[] arr = new String[] {"cabaabaaaa","ccbcababac","bacaabccba","bcbbcbacaa","abcaccbcaa","accabaccaa","cabcbbbcca","ababccabcb","caccbbcbab","bccbacbcba"};
        WordFilter wordFilter = new WordFilter(arr);

        assertEquals(9, wordFilter.f("a", "aa"));

    }

}
