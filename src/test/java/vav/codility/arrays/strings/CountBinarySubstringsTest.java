package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountBinarySubstringsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("00100", 2),
                Arguments.of("00110011", 6),
                Arguments.of("10101", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int exp) {
        assertEquals(exp, new CountBinarySubstrings().countBinarySubstrings(in));
    }

}
