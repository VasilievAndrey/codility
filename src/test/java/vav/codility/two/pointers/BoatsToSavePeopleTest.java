package vav.codility.two.pointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BoatsToSavePeopleTest {

    @Test
    public void test0() {
        int[] nums = {1,2};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 3);
        assertEquals(actualValue, 1);
    }

    @Test
    public void test() {
        int[] nums = {3,5,3,4};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 5);
        assertEquals(actualValue, 4);
    }

    @Test
    public void test2() {
        int[] nums = {3,8,7,1,4};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 9);
        assertEquals(actualValue, 3);
    }

    @Test
    public void test3() {
        int[] nums = {5,1,4,2};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 6);
        assertEquals(actualValue, 2);
    }

    @Test
    public void test4() {
        int[] nums = {3,2,2,1};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 3);
        assertEquals(actualValue, 3);
    }

    @Test
    public void test5() {
        int[] nums = {1,5,3,5};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 7);
        assertEquals(actualValue, 3);
    }

    @Test
    public void test6() {
        int[] nums = {3,1,6,7,5};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 7);
        assertEquals(actualValue, 4);
    }

    @Test
    public void test7() {
        int[] nums = {21,40,16,24,30};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 50);
        assertEquals(actualValue, 3);
    }

    @Test
    public void test8() {
        int[] nums = {2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 50);
        assertEquals(actualValue, 11);
    }

    @Test
    public void test9() {
        int[] nums = {1,1,1,1,1,1};
        int actualValue = BoatsToSavePeople.numRescueBoats(nums, 6);
        assertEquals(actualValue, 1);
    }

}
