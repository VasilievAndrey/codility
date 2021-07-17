package vav.codility.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueReconstructionByHeightTest {

    @Test
    public void test() {
        int[][] in = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ints = new QueueReconstructionByHeight().reconstructQueue(in);
        System.out.println(ints.length);
    }

}
