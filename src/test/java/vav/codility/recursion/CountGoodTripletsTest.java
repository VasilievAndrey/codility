package vav.codility.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CountGoodTripletsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{3,0,1,1,9,7},7,2,3,4),
                Arguments.of(new int[]{1,1,2,2,3}, 0,0,1,0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int a, int b, int c, int res) {
        assertEquals(res, new CountGoodTriplets().countGoodTriplets(in, a,b,c));
    }
}
