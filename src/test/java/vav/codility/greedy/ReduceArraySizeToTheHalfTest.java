package vav.codility.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceArraySizeToTheHalfTest {

    @Test
    public void minSetSize() {

        int[] in = new int[] {3,3,3,3,5,5,5,2,2,7};
        assertEquals(2, new ReduceArraySizeToTheHalf().minSetSize(in));

    }
}
