package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class KClosestPointstoOriginTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2,10},{-9,9},{0,8},{-2,2},{8,9},{-10,7},{-5,2},{-4,-9}},7, new int[][] {{-2,-2},{-5,2},{0,8},{-4,-9},{2,10},{8,9},{-10,-7}}),
                Arguments.of(new int[][]{{1,3},{-2,2}} ,1, new int[][] {{-2,2}}),
                Arguments.of(new int[][]{{3,3},{5,-1},{-2,4}} ,2, new int[][] {{3,3},{-2,4}})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] in, int k, int[][] exp) {
        assertThat(exp).isEqualTo(new KClosestPointstoOrigin().kClosest(in, k));
    }

}
