package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class FindFirstandLastPositionofElementInSortedArrayTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, 3, new int[] {2,2}),
                Arguments.of(new int[]{0,0,1,1,1,2,2,2,4,4,4,5,5,7,7,8,8,8,9,9,11,12,12,13},  6, new int[] {-1,-1}),
                Arguments.of(new int[]{2,2}, 3, new int[] {-1,-1}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 6, new int[] {-1,-1}),
                Arguments.of(new int[]{1,3,5,6,8,8}, 8, new int[] {4,5}),
                Arguments.of(new int[]{1,3}, 1, new int[] {0,0}),
                Arguments.of(new int[]{2,2}, 2, new int[] {0,1}),
                Arguments.of(new int[]{1}, 12, new int[] {-1,-1}),
                Arguments.of(new int[]{1}, 1, new int[] {0,0}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 8, new int[] {3,4}),
                Arguments.of(new int[]{}, 6, new int[] {-1,-1})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int tr, int[] exp) {

        assertThat(new FindFirstandLastPositionofElementInSortedArray().searchRange(in, tr)).isEqualTo(exp);
    }

}
