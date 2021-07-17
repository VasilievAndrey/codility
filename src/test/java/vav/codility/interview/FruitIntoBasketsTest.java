package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FruitIntoBasketsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, 3),
                Arguments.of(new int[]{0, 1, 2, 2}, 3),
                Arguments.of(new int[]{1, 2, 3, 2, 2}, 4),
                Arguments.of(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void totalFruit(int[] input, int expected) {
        assertEquals(expected, FruitIntoBaskets.totalFruit(input));
    }
}
