package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PutBoxesIntoTheWarehouseITest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of( new int[] {4,3,4,1}, new int[] {5,3,3,4,1}, 3),
                Arguments.of( new int[] {1,2,2,3,4}, new int[] {3,4,1,2}, 3),
                Arguments.of( new int[] {1,2,3}, new int[] {1,2,3,4}, 1),
                Arguments.of( new int[] {4,5,6}, new int[] {3,3,3,3,3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int[] w, int exp) {
        assertThat(new PutBoxesIntoTheWarehouseI().maxBoxesInWarehouse(in, w)).isEqualTo(exp);
    }

}
