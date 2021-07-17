package vav.codility.design;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamCheckerTest {

    @Test
    public void test() {
        StreamChecker st = new StreamChecker(new String[] {"cd","f","kl"});
        assertFalse(st.query('a'));          // return false
        assertFalse(st.query('b'));          // return false
        assertFalse(st.query('c'));          // return false
        assertTrue(st.query('d'));          // return true, becau)se 'cd' is in the wordlist
        assertFalse(st.query('e'));          // return false
        assertTrue(st.query('f'));          // return true, beca)use 'f' is in the wordlist
        assertFalse(st.query('g'));          // return false
        assertFalse(st.query('h'));          // return false
        assertFalse(st.query('i'));          // return false
        assertFalse(st.query('j'));          // return false
        assertFalse(st.query('k'));          // return false
        assertTrue(st.query('l'));          // return true,
    }
    @Test
    public void test2() {
        StreamChecker st = new StreamChecker(new String[] {"ab","ba","aaab","abab","baa"});

        assertFalse(st.query('a'));
        assertFalse(st.query('a'));
        assertFalse(st.query('a'));
        assertFalse(st.query('a'));
        assertFalse(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertFalse(st.query('b'));
        assertFalse(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertFalse(st.query('b'));
        assertFalse(st.query('b'));
        assertFalse(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('a'));
        assertFalse(st.query('a'));
        assertTrue(st.query('b'));
        assertTrue(st.query('a'));
        assertTrue(st.query('a'));
        assertFalse(st.query('a'));
    }
}
