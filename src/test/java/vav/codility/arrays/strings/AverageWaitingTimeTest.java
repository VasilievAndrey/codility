package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class AverageWaitingTimeTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2},{2,5},{4,3}}, 5.0),
                Arguments.of(new int[][]{{5,2},{5,4},{10,3},{20,1}}, 3.250)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[][] in, double exp) {
        assertEquals(exp, new AverageWaitingTime().averageWaitingTime(in),1e-15 );
    }
}
