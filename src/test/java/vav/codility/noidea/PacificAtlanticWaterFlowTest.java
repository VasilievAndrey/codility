package vav.codility.noidea;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PacificAtlanticWaterFlowTest {

    @Test
    public void pacificAtlantic0() {
        int[][] nums = new int[][] {{1,2,3},{8,9,4},{7,6,5}};
        List<List<Integer>> lists = new PacificAtlanticWaterFlow().pacificAtlantic(nums);
        System.out.println(lists.size());
    }
    @Test
    public void pacificAtlantic() {
        int[][] nums = new int[][] {{1,1}, {1,1}, {1,1}};
        List<List<Integer>> lists = new PacificAtlanticWaterFlow().pacificAtlantic(nums);
        System.out.println(lists.size());
    }
    @Test
    public void pacificAtlantic2() {
        int[][] nums = new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> lists = new PacificAtlanticWaterFlow().pacificAtlantic(nums);
        System.out.println(lists.size());
    }
}
