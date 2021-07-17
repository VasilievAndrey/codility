package vav.codility.facebook.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumRemoveToMakeValidParenthesesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("lee(t(c)o)de)", "lee(t(c)o)de"),
                Arguments.of("a)b(c)d", "ab(c)d"),
                Arguments.of("))((", ""),
                Arguments.of("(a(b(c)d)", "a(b(c)d)")
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void minRemoveToMakeValid(String input, String result) {
        assertEquals(result, MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(input));
    }
}
