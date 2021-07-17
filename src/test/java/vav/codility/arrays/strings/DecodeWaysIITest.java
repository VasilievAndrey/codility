package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DecodeWaysIITest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("1*",18),
                Arguments.of("*",9),
                Arguments.of("2*", 15)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int exp){
        assertEquals(exp, new DecodeWaysII().numDecodings(in));
    }

}
