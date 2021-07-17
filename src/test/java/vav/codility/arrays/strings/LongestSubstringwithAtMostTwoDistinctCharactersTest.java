package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestSubstringwithAtMostTwoDistinctCharactersTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abccbbcccaaacaca", 10),
                Arguments.of("abaccc", 4),
                Arguments.of("aabbaaabbbaaa", 13),
                Arguments.of("eceba", 3),
                Arguments.of("ccaabbber", 5),
                Arguments.of("aa", 2),
                Arguments.of("a", 1),
                Arguments.of("ccaabbb", 5),
                Arguments.of("ccaabbbr", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int exp) {
        assertEquals(exp, new LongestSubstringwithAtMostTwoDistinctCharacters().lengthOfLongestSubstringTwoDistinct(in));

    }

}
