package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MinimumElementsToAddToFormAGivenSumTest {
    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,-10,9,1}, 100, 0, 1),
                Arguments.of(new int[]{1, -1, 1}, 3, -4, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void minElements(int[] in, int limit, int goal, int res) {

        assertEquals(res, MinimumElementsToAddToFormAGivenSum.minElements(in, limit, goal));
    }
}
