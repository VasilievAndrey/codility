package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ReorderedPowerTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(46, true),
                Arguments.of(1, true),
                Arguments.of(10, false),
                Arguments.of(16, true),
                Arguments.of(24, false)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int input, boolean exp) {
        assertEquals(exp, new ReorderedPower().reorderedPowerOf2(input));
    }
}
