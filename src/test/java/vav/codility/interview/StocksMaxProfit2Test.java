package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StocksMaxProfit2Test {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,4,2,5,7,2,4,9,0}, 13),
                Arguments.of(new int[]{1,2,3,4,5}, 4),
                Arguments.of(new int[]{3,3,5,0,0,3,1,4}, 6),
                Arguments.of(new int[]{7,6,4,3,1}, 0),
                Arguments.of(new int[]{1}, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int exp) {
        assertThat(new StocksMaxProfit2().maxProfit(in)).isEqualTo(exp);
    }
}
