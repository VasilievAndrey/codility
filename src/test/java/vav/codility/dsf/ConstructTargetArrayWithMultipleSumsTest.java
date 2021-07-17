package vav.codility.dsf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConstructTargetArrayWithMultipleSumsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,1000000000}, true),
                Arguments.of(new int[] {9,3,5}, true),
                Arguments.of(new int[] {1,1,1,2}, false),
                Arguments.of(new int[] {8,5}, true)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in ,boolean exp) {
        assertEquals(exp, new ConstructTargetArrayWithMultipleSums().isPossible(in));
    }

}
