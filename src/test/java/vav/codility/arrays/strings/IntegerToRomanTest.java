package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(9, "IX"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV")
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void intToRoman(int input, String expected) {

        assertEquals(expected, IntegerToRoman.intToRoman(input));
    }

}
