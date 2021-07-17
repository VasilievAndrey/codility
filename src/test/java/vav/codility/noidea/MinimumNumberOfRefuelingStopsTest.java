package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MinimumNumberOfRefuelingStopsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(1,1,new int[][] {{}},0),
                Arguments.of(100,1,new int[][] {{10,100}},-1),
                Arguments.of(100,10,new int[][] {{10,60},{20,30},{30,30},{60,40}},2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int t, int st, int[][] in, int exp) {
        assertEquals(exp, new MinimumNumberOfRefuelingStops().minRefuelStops(t, st, in));
    }

}
