package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestIncreasingPathinMatrixTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][] {{9,9,4},{6,6,8},{2,1,1}}, 4),
                Arguments.of(new int[][] {{3,4,5},{3,2,6},{2,2,1}}, 4),
                Arguments.of(new int[][] {{1}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] mtrx, int exp) {
        assertEquals(exp, new LongestIncreasingPathinMatrix().longestIncreasingPath(mtrx));
    }

}
