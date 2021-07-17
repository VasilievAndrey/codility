package vav.codility.facebook.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerifyingAnAlienDictionaryTest {

    @Test
    public void isAlienSorted() {
        String[] strings = {"apple", "app"};
        assertEquals(false, VerifyingAnAlienDictionary.isAlienSorted(strings, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void isAlienSorted2() {
        String[] strings = {"hello","leetcode"};
        assertEquals(true, VerifyingAnAlienDictionary.isAlienSorted(strings, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void isAlienSorted3() {
        String[] strings = {"word","world","row"};
        assertEquals(false, VerifyingAnAlienDictionary.isAlienSorted(strings, "worldabcefghijkmnpqstuvxyz"));
    }
}
