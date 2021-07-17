package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(2,1),
                Arguments.of(2,1),
                Arguments.of(3,2),
                Arguments.of(4,3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int in, int exp) {
        assertEquals(exp, new FibonacciNumber().fib(in));
    }
}
