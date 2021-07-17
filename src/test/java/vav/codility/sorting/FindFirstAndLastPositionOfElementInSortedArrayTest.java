package vav.codility.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {5,7,7,8,8,10}, 6,new int[] {-1,-1}),
                Arguments.of(new int[] {1,2,3}, 3,new int[] {2,2}),
                Arguments.of(new int[] {0,0,2,3,4,4,4,5},5,new int[] {7,7}),
                Arguments.of(new int[] {0,1,2,3,4,4,4,5},0,new int[] {0,0}),
                Arguments.of(new int[] {5,7,7,8,8,10}, 8,new int[] {3,4}),
                Arguments.of(new int[] {1}, 1,new int[] {0,0}),
                Arguments.of(new int[] {2,2}, 2,new int[] {0,1}),
                Arguments.of(new int[] {0,0,1,1,1,2,3,4,4,5,6,7,7,7,8,8,8,8,9,9,10}, 4,new int[] {7,8})
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int tr, int[] exp) {
        int[] act = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(in, tr);
        assertThat(act).isEqualTo(exp);
    }

}
