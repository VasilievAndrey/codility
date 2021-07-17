package vav.codility.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class NumberOfConnectedComponentsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2,3},{1,2},{1,3}}, 4, 2),
                Arguments.of(new int[][]{{0,1}, {1,2},{3,4}}, 5, 2),
                Arguments.of(new int[][]{{0,1},{0,2},{2,3},{2,4}}, 5, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] in, int n, int exp) {
        assertEquals(exp, new NumberOfConnectedComponents().countComponents(n, in));
    }


}
