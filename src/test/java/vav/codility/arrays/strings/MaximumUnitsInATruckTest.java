package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MaximumUnitsInATruckTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1,3},{2,2},{3,1}}, 4,8),
                Arguments.of(new int[][]{{5,10}, {2,5},{4,7}, {3,9}}, 10,91)
                );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] arr, int d, int exp) {
        assertEquals(exp, new MaximumUnitsInATruck().maximumUnits(arr, d));
    }

}
