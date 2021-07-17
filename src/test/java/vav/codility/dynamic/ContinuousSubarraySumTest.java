package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ContinuousSubarraySumTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{23,2,4,6,6},7, true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int k, boolean exp) {
        assertEquals(exp, new ContinuousSubarraySum().checkSubarraySum(in, k));
    }
}
