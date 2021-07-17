package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("881095803","61", "53746843983"),
                Arguments.of("0", "0", "0"),
                Arguments.of("123", "456", "56088"),
                Arguments.of("2", "3", "6")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void multiply(String a, String b, String res) {
        assertEquals(res, MultiplyStrings.multiply(a,b));
    }
}
