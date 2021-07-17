package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class AllTriplesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, new int[][] {{-1,-1,2},{-1,0,1}})
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int[][] exp) {
        assertThat(new AllTriples().threeSum(in)).isEqualTo(exp);
    }

}
