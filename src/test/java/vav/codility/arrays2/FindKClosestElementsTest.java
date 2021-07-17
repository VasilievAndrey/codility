package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FindKClosestElementsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,1,1,10,10,10}, 1, 9, new int[] {10}),
                Arguments.of(new int[] {1,2,3,4,5}, 4,3, new int[] {1,2,3,4}),
                Arguments.of(new int[] {1,2,3,4,5}, 4,-1, new int[] {1,2,3,4})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int k, int x, int[] exp) {
        assertThat(new FindKClosestElements().findClosestElements(in, k,x)).isEqualTo(exp);
    }
}
