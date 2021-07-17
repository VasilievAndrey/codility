package vav.codility.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfAbsoluteDifferencesInASortedArrayTest {

    @Test
    public void getSumAbsoluteDifferences() {

        int[] nums = new int[] {2,3,5};
        int[] exp = new int[] {4,3,5};
        assertEquals(exp, new SumOfAbsoluteDifferencesInASortedArray().getSumAbsoluteDifferences(nums));
    }
}
