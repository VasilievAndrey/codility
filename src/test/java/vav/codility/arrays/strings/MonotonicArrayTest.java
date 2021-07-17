package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,2,2,3},true),
                Arguments.of(new int[] {1,2,5,3,3},false),
                Arguments.of(new int[] {1,3,2},false),
                Arguments.of(new int[] {6,5,4,4},true),
                Arguments.of(new int[] {1,2,4,5},true),
                Arguments.of(new int[] {1,1,1},true)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, boolean exp) {
        assertEquals(exp, new MonotonicArray().isMonotonic(in));
    }

}
