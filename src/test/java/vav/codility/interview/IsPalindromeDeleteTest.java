package vav.codility.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeDeleteTest {

    @Test
    public void test() {
        assertEquals(true,new IsPalindromeDelete().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        assertEquals(true,new IsPalindromeDelete().validPalindrome("aba"));
        assertEquals(true,new IsPalindromeDelete().validPalindrome("abca"));
        assertEquals(false,new IsPalindromeDelete().validPalindrome("abc"));
    }

}
