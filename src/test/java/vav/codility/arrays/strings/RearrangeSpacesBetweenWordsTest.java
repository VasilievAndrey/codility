package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class RearrangeSpacesBetweenWordsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("hello   world", "hello   world"),
                Arguments.of("a ", "a "),
                Arguments.of("a", "a"),
                Arguments.of(" practice   makes   perfect", "practice   makes   perfect "),
                Arguments.of("  this   is  a sentence ", "this   is   a   sentence")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String exp) {
        String actual = new RearrangeSpacesBetweenWords().reorderSpaces(in);
        assertEquals(exp, actual);
    }
}
