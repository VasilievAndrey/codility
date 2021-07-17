package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CalculateTheSumTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{10,15,20}, 15),
                Arguments.of(new int[]{1,100,1,1,1,100,1,1,100,1}, 6)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test() {

    }

}
