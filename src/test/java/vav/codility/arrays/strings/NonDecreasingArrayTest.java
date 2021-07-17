package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NonDecreasingArrayTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {5,7,1,8}, true),
                Arguments.of(new int[] {3,4,2,3}, false),
                Arguments.of(new int[] {-1,4,2,3}, true),
                Arguments.of(new int[] {4,2,3}, true),
                Arguments.of(new int[] {4,2,1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, boolean exp) {
        assertEquals(exp,new NonDecreasingArray().checkPossibility(in));
    }
}
