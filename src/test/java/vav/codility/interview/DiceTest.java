package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DiceTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(2,5,10,1),
                Arguments.of(1,6,3,1),
                Arguments.of(2,6,7,6),
                Arguments.of(1,2,3,0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int d, int f, int t, int exp) {
        assertEquals(exp, new Dice().numRollsToTarget(d, f, t));
    }

}
