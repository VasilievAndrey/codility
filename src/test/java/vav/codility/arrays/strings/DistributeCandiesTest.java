package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {
        int[] nums = {1,1,2,2,3,3};
        Integer i = DistributeCandies.distributeCandies(nums);
        assertEquals(Integer.valueOf(3), i);
    }
}
