package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DecodeWaysTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("111111111111111111111111111111111111111111111",0),
                Arguments.of("06",0),
                Arguments.of("12", 2),
                Arguments.of("226",3),
                Arguments.of("0",0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int exp) {
        assertEquals(exp, new DecodeWays().numDecodings(in));

    }


}
