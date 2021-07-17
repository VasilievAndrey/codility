package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MaximumPerformanceTest {


    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(6, new int[] {2,10,3,1,5,8}, new int[]{5,4,3,9,7,2},2,60),
                Arguments.of(6, new int[] {2,10,3,1,5,8}, new int[]{5,4,3,9,7,2},3,68),
                Arguments.of(6, new int[] {2,10,3,1,5,8}, new int[]{5,4,3,9,7,2},4,72)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, int[] in, int[] in2, int k, int exp) {
        assertEquals(exp, new MaximumPerformance().maxPerformance(n, in, in2, k));
    }

}
