package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StockMaxProfitTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {7,1,5,3,6,4},5),
                Arguments.of(new int[] {7,6,4,3,1}, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int exp) {
        assertEquals(exp, new StockMaxProfit().maxProfit(in));
    }

}
