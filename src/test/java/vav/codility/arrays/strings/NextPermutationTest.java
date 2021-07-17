package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import vav.codility.interview.NextPermutation2;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class NextPermutationTest {


    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1}, new int[]{3, 1, 2}),
                Arguments.of(new int[]{3, 2, 1}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 3, 2}, new int[]{2, 1, 3}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 3, 2}),
                Arguments.of(new int[]{1, 1, 5}, new int[]{1, 5, 1}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void nextPermutation(int[] input, int[] expected) {
        new NextPermutation().nextPermutation(input);
        assertThat(input).isEqualTo(expected);
    }
}
