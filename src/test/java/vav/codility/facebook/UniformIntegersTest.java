package vav.codility.facebook;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class UniformIntegersTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(75, 300, 5),
                Arguments.of(1,9, 9),
                Arguments.of(999999999999L,999999999999L, 1)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(long a, long b, int exp) {
        assertEquals(exp, new UniformIntegers().getUniformIntegerCountInInterval(a,b));
    }
}
