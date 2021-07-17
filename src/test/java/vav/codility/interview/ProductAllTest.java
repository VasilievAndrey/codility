package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductAllTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[] {24,12,8,6}),
                Arguments.of(new int[]{-1,1,0,-3,3}, new int[] {0,0,9,0,0})
        );
    }


    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int[] exp) {
        assertThat(new ProductAll().productExceptSelf(in)).isEqualTo(exp);
    }

}
