package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestValidParenthesesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("()(()", 2),
                Arguments.of("()()", 4),
                Arguments.of(")()())", 4),
                Arguments.of("(((()())())(", 10),
                Arguments.of("((()())())", 10),
                Arguments.of("(()", 2),
                Arguments.of("", 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String in, int exp) {
        assertEquals(exp, new LongestValidParentheses().longestValidParentheses(in));
    }

}
