package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NumberOfSubarraysWithBoundedMaximumTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 4, 3},2,3,3)
                );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int left, int right, int exp) {
        assertEquals(exp, new NumberOfSubarraysWithBoundedMaximum().numSubarrayBoundedMax(in, left, right));
    }

}
