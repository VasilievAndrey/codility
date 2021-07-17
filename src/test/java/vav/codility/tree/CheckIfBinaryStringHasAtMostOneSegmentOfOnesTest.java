package vav.codility.tree;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {

    @Test
    public void checkOnesSegment1() {
        assertEquals(CheckIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment("10"), true);

    }
    @Test
    public void checkOnesSegment() {
        assertEquals(CheckIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment("110"), true);

    }
    @Test
    public void checkOnesSegment2() {
        assertEquals(CheckIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment("1001"), false);
//        new HashMap<>().si
    }
}
