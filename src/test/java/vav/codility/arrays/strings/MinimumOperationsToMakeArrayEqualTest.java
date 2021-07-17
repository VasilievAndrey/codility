package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MinimumOperationsToMakeArrayEqualTest {
    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(6,9),
                Arguments.of(3,2)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int in, int exp) {
        assertEquals(exp, new MinimumOperationsToMakeArrayEqual().minOperations(in));
    }

}
