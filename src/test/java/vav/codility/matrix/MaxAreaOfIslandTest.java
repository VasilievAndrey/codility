package vav.codility.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MaxAreaOfIslandTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}}, 6),
                Arguments.of(new int[][] {{0,0,0,0,0,0,0,0}}, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[][] grid, int exp) {
        assertEquals(exp, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }

}
