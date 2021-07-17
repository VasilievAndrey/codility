package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}}, new int[][]{{1,3},{4,7}}),
                Arguments.of(new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}}, new int[][]{{1,10}}),
                Arguments.of(new int[][]{{1,3},{2,6},{8,10},{15,18}}, new int[][]{{1,6},{8,10},{15,18}})
        );
    }


    @MethodSource("getArguments")
    @ParameterizedTest
    public void merge11(int[][] input, int[][] exp) {
        assertEquals(exp, new MergeIntervals().merge(input));
    }
}
