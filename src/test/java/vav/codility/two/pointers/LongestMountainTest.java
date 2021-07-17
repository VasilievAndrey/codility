package vav.codility.two.pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class LongestMountainTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{0,0,1,0,0,1,1,1,1,1}, 3),
                Arguments.of(new int[]{0,2,0,2,1,2,3,4,4,1}, 3),
                Arguments.of(new int[]{7,4,8}, 0),
                Arguments.of(new int[]{9,8,7,6,5,4,3,2,1,0}, 0),
                Arguments.of(new int[]{3, 2}, 0),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0}, 11),
                Arguments.of(new int[]{2, 1, 4, 7, 3, 2, 5}, 5),
                Arguments.of(new int[]{2, 2, 2}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void calcTest(int[] input, int expected) {
        assertEquals(expected, LongestMountain.longestMountain(input));
    }

}
