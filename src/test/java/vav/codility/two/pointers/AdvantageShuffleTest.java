package vav.codility.two.pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class AdvantageShuffleTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, new int[] {1,10,4,11}, new int[] {2,11,7,15})
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] A, int[]B, int[] exp) {
        int[] actual = new AdvantageShuffle().advantageCount(A, B);
        assertEquals(exp, actual);
    }
}
