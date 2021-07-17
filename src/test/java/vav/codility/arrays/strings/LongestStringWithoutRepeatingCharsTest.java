package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestStringWithoutRepeatingCharsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("xxzqi", 4),
                Arguments.of("anviaj", 5),
                Arguments.of("aabaab!bb", 3),
                Arguments.of(" ", 1),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("", 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void lengthOfLongestSubstring(String input, int expected) {
        assertEquals(expected, LongestStringWithoutRepeatingChars.lengthOfLongestSubstring(input));
    }
}
