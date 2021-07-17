package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SwapToLettersTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abca", "abda", false),
                Arguments.of("abac", "abad", false),
                Arguments.of("ab", "ca", false),
                Arguments.of("aa", "aa", true),
                Arguments.of("ab", "ba", true),
                Arguments.of("ab", "ab", false),
                Arguments.of("aaaaaaabc", "aaaaaaacb", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String in2, boolean exp) {
        assertEquals(exp, new SwapToLetters().buddyStrings(in, in2));

    }

}
