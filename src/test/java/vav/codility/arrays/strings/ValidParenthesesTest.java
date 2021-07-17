package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("[([]])", false),
                Arguments.of("(){}}{", false),
                Arguments.of("([)]", false),
                Arguments.of("()[]{}", true),
                Arguments.of("()", true),
                Arguments.of("(]", false),
                Arguments.of("{[]}", true),
                Arguments.of("(())", true)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void isValid(String input, boolean result) {
        assertEquals(result, ValidParentheses.isValid(input));
    }
}
