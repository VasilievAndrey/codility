package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{186, 419, 83, 408}, 6249, 20),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1, 2, 5}, 11, 3),
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{1}, 1, 1),
                Arguments.of(new int[]{1}, 2, 2)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void coinChange(int[] input, int amount, int result) {
        assertEquals(result, CoinChange.coinChange(input, amount));
    }
}
