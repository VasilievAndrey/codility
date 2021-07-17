package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MissingNumberInArithmeticProgressionTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {5,7,11,13},9),
                Arguments.of(new int[]{15,13,12},14)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int exp) {
        assertEquals(exp, new MissingNumberInArithmeticProgression().missingNumber(in));
    }
}
