package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 1}, 2),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void maxProfit(int[] input, int result) {
        assertEquals(result, BestTimeToBuyAndSellStock.maxProfit(input));
    }
}
