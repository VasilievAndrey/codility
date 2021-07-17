package vav.codility.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NumberOfWaysWhereSquareOfNumberTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{7,4}, new int[]{5,2,8,9}, 1),
                Arguments.of(new int[]{1,1}, new int[]{1,1,1}, 9),
                Arguments.of(new int[]{7,7,8,3}, new int[]{1,2,9,7}, 2),
                Arguments.of(new int[]{4,7,9,11,23}, new int[]{3,5,1024,12,18}, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] num1, int[] num2, int exp) {
        assertEquals(exp, new NumberOfWaysWhereSquareOfNumber().numTriplets(num1, num2));
    }

}
