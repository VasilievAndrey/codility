package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ValidNumberTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("6+1", false),
                Arguments.of(".e1", false),
                Arguments.of("2", true),
                Arguments.of("0089", true),
                Arguments.of("-0.1", true),
                Arguments.of("+3.14", true),
                Arguments.of("4.", true),
                Arguments.of("-.9", true),
                Arguments.of("2e10", true),
                Arguments.of("-90E3", true),
                Arguments.of("3e+7", true),
                Arguments.of("+6e-1", true),
                Arguments.of("53.5e93", true),
                Arguments.of("-123.456e789", true),
                Arguments.of("abc", false),
                Arguments.of("1a", false),
                Arguments.of("1e", false),
                Arguments.of("e3", false),
                Arguments.of("99e2.", false),
                Arguments.of("--6", false),
                Arguments.of("-+3", false),
                Arguments.of("95a54e53", false),
                Arguments.of(".", false),
                Arguments.of("..", false),
                Arguments.of(".1", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in ,boolean exp) {
        assertEquals(exp, new ValidNumber().isNumber(in));
    }
}
