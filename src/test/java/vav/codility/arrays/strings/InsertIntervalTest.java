package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class InsertIntervalTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][] {{1,5}}, new int[]{0,1}, new int[][]{{1,5}, {6,8}}),
                Arguments.of(new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}, new int[][]{{1,2},{3,10},{12,16}}),
                Arguments.of(new int[][] {{1,5}}, new int[]{0,0}, new int[][]{{0,0}, {1,5}}),
                Arguments.of(new int[][] {{1,5}}, new int[]{6,8}, new int[][]{{1,5}, {6,8}}),
                Arguments.of(new int[][] {}, new int[]{5,7}, new int[][]{{5,7}}),
                Arguments.of(new int[][] {{1,3},{6,9}}, new int[]{2,5}, new int[][]{{1,5},{6,9}})
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void insert(int[][] input, int[] in, int[][] exp) {
        assertEquals(exp, new InsertInterval().insert(input, in));
    }
}
