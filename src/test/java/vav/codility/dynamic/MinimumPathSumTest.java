package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class MinimumPathSumTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1,3,1},{1,5,1},{4,2,1}}, 7),
                Arguments.of(new int[][]{{1,2,3},{4,5,6}}, 12)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[][] in, int exp) {
        assertEquals(exp, new MinimumPathSum().minPathSum(in));
    }

}
