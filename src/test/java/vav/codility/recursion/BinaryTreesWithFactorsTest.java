package vav.codility.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BinaryTreesWithFactorsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{18,3,6,2}, 12),
                Arguments.of(new int[]{2, 4}, 3),
                Arguments.of(new int[]{2, 4, 5, 10}, 7)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void numFactoredBinaryTrees(int[] input, int res) {
        assertEquals(res, new BinaryTreesWithFactors().numFactoredBinaryTrees(input));
    }
}
