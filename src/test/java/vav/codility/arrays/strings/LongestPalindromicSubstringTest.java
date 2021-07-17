package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("xaabacxcabaaxcabaax", "xaabacxcabaax"),
                Arguments.of("accc", "ccc"),
                Arguments.of("cccb", "ccc"),
                Arguments.of("ccc", "ccc"),
                Arguments.of("cbbd", "bb"),
                Arguments.of("ac", "a"),
                Arguments.of("babad", "bab"),
                Arguments.of("a", "a")
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void longestPalindrome(String input, String result) {
        assertEquals(result, LongestPalindromicSubstring.longestPalindrome(input));
    }
}
