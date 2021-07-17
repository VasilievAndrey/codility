package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RemoveDuplicatesStrTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abbaca", "ca"),
                Arguments.of("azxxzy", "ay")
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String in, String exp) {
        assertEquals(exp, new RemoveDuplicatesStr().removeDuplicates(in));
    }

}
