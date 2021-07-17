package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FurthestBuildingYouCanReachTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{4,12,2,7,3,18,20,3,19}, 10, 2, 7),
                Arguments.of(new int[]{4,2,7,6,9,14,12}, 5, 1, 4),
                Arguments.of(new int[]{7,5,13}, 0, 0, 1),
                Arguments.of(new int[]{1,2}, 0, 0, 0),
                Arguments.of(new int[]{14,3,19,3}, 17, 0, 3)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] nums, int br, int l, int exp) {
        assertEquals(exp, new FurthestBuildingYouCanReach().furthestBuilding(nums, br, l));
    }
}
