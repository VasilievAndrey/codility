package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class SplitArrayLargestSumTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{7,2,5,10,8}, 2, 18),
                Arguments.of(new int[]{1,2,3,4,5}, 2, 9),
                Arguments.of(new int[]{1,4,4}, 3, 4)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int in2, int exp) {
        assertThat(new SplitArrayLargestSum().splitArray(in, in2)).isEqualTo(exp);
    }

}
