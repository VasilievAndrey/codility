package vav.codility.graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class RedundantConnectionTest {


    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][] {{1,2},{2,3},{3,4},{1,4},{1,5}}, new int[] {1,4})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] in, int[] exp) {
        assertThat(new RedundantConnection().findRedundantConnection(in)).isEqualTo(exp);
    }

}
