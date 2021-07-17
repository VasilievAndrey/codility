package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderArrTest {

    @Test
    public void wiggleSort() {
        int[] nums = new int[] {3,5,2,1,6,4};
        int[] exp = new int[] {3,5,1,6,2,4};
        new ReorderArr().wiggleSort(nums);
        assertEquals(exp, nums);
    }

    @Test
    public void wiggleSort2() {
        int[] nums = new int[] {6,6,5,6,3,8};
        int[] exp = new int[] {6,6,5,6,3,8};
        new ReorderArr().wiggleSort(nums);
        assertEquals(exp, nums);
    }
    @Test
    public void wiggleSort3() {
        int[] nums = new int[] {3,3,8,5,6,3,3};
        int[] exp = new int[] {3,8,3,6,3,5,3};
        new ReorderArr().wiggleSort(nums);
        assertEquals(exp, nums);
    }
    @Test
    public void wiggleSort4() {
        int[] nums = new int[] {3,2,1};
        int[] exp = new int[] {2,3,1};
        new ReorderArr().wiggleSort(nums);
        assertEquals(exp, nums);
    }
}
