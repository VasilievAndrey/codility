package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MaximumErasureValueTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{4,2,4,5,6}, 17),
                Arguments.of(new int[]{5,2,1,2,5,2,1,2,5}, 8)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int exp) {
        assertEquals(exp, new MaximumErasureValue().maximumUniqueSubarray(in));
    }

}
