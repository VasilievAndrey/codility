package vav.codility.dsf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NumberOfWaysToReduceTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(14,6),
                Arguments.of(8,4)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int in, int exp) {
        assertEquals(exp, new NumberOfWaysToReduce().numberOfSteps(in));
    }
}
