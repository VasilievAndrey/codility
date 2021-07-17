package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtoiTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("9223372036854775808", 2147483647),
                Arguments.of("000-12dds", 0),
                Arguments.of("21474836460", 2147483647),
                Arguments.of("+-42", 0),
                Arguments.of("words and 987", 0),
                Arguments.of("42", 42),
                Arguments.of("  -42", -42),
                Arguments.of("4193 with words", 4193),
                Arguments.of("-91283472332", -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void myAtoi(String input, int result) {
        assertEquals(result, Atoi.myAtoi(input));
    }

}
