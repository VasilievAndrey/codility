package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RemoveAllAdjacentDuplicates2Test {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abbaca", "ca"),
                Arguments.of("azxxzy", "ay")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String exp) {
        assertEquals(exp, new RemoveAllAdjacentDuplicates2().removeDuplicates(in));
    }

    }
