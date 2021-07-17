package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StrobogrammaticNumberTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("25", false),
                Arguments.of("2", false),
                Arguments.of("101", true),
                Arguments.of("121", false),
                Arguments.of("69", true),
                Arguments.of("619", true),
                Arguments.of("68189", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void isStrobogrammatic(String in, boolean exp) {
        assertEquals(exp, StrobogrammaticNumber.isStrobogrammatic(in));
    }
}
