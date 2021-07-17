package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class InterleavingStringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("aabcc", "dbbca", "aadbbcbcac", true),
                Arguments.of("aabcc", "dbbca", "aadbbbaccc", false),
                Arguments.of("", "", "", true)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String s1, String s2, String s3, boolean exp) {
        assertEquals(exp, new InterleavingString().isInterleave(s1, s2, s3));

    }

}
