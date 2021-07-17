package vav.codility.arrays.strings;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationIITest {

    @Test
    public void permuteUnique1() {
        int[] nums = {1,1,2};
        List<List<Integer>> lists = new PermutationII.Solution().permuteUnique(nums);
        System.out.println(lists);

    }
    @Test
    public void permuteUnique2() {
        int[] nums = {1,1,2};
        List<List<Integer>> lists = new PermutationII().permuteUnique(nums);
        System.out.println(lists);

    }
    @Test
    public void permuteUnique() {
        int[] nums = {1,2,3,4};
        List<List<Integer>> lists = new PermutationII().permuteUnique(nums);
        System.out.println(lists);

    }
}
