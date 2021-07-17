package vav.codility.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CoinsToChangeTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5}, 11, 3)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void coinChange(int[] input, int amount, int exp) {

        assertEquals(exp, new CoinsToChange().coinChange(input, amount));
    }
}
