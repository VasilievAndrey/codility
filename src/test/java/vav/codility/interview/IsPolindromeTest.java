package vav.codility.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPolindromeTest {

    @Test
    public void test() {
        assertTrue(new IsPalindrome().isPalindrome(" "));
        assertTrue(new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

}
