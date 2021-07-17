package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MatchsticksToSquareTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,1,2,2,2}, true),
                Arguments.of(new int[] {3,3,3,3,4}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, boolean exp) {
        assertEquals(exp, new MatchsticksToSquare().makesquare(in));
    }

}
