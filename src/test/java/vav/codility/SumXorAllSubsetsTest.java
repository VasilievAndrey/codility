package vav.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumXorAllSubsetsTest {

    @Test
    public void test() {
        assertEquals(1, new SumXorAllSubsets().subsetXORSum(new int[] {1,2,3,4,5,}));
    }

}
