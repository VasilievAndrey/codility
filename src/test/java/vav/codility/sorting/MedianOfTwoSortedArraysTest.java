package vav.codility.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class MedianOfTwoSortedArraysTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{2,3}, 2.5),
                Arguments.of(new int[]{1, 3}, new int[]{2,7}, 2.5),
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}, 0.0),
                Arguments.of(new int[]{}, new int[]{1}, 1.0),
                Arguments.of(new int[]{2}, new int[]{}, 2.0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void findMedianSortedArrays(int[] nums1, int[] nums2, Double result) {
        assertEquals(result, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}
