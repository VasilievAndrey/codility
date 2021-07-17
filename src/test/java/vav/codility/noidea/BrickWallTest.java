package vav.codility.noidea;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class BrickWallTest {

    @Test
    public void test() {
        List<List<Integer>> in = asList(asList(1,2,2,1),
                asList(3,1,2),
                asList(1,3,2),
                asList(2,4),
                asList(3,1,2),
                asList(1,3,1,1));
        assertEquals(2, new BrickWall().leastBricks(in));
    }

}
