package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class MissingRangesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{-1},-1,0, asList("0")),
                Arguments.of(new int[]{-1},-3,-1, asList("-3->-2")),
                Arguments.of(new int[]{-1},-2,-1, asList("-2")),
                Arguments.of(new int[]{-1},-1,-1, asList()),
                Arguments.of(new int[]{0,1,3,50,75},3,49, asList("4->49")),
                Arguments.of(new int[]{0,1,3,50,75},0,99, asList("2","4->49","51->74","76->99")),
                Arguments.of(new int[]{},1,1, asList("1")),
                Arguments.of(new int[]{},-3,-1, asList("-3->-1"))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int l, int up, List<String> exp) {
        assertThat(new MissingRanges().findMissingRanges(in,l, up)).isEqualTo(exp);
    }
}
