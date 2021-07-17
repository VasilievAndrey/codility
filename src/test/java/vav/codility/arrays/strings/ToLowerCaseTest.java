package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("Hello", "hello"),
                Arguments.of("here", "here"),
                Arguments.of("LOVELY", "lovely")
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String in, String exp) {
        assertEquals(exp, new ToLowerCase().toLowerCase(in));
    }

}
