package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PernuteTheTStringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("cba", "abcd", "cbad")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String in2, String exp) {
        String actual = new PernuteTheTString().customSortString(in, in2);
        assertEquals(exp, actual);
    }
}
