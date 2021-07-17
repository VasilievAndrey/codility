package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ArraySquaresTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{-4,-1,0,3,10},new  int[]{0,1,9,16,100})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int[] exp) {
        int[] actual = new ArraySquares().sortedSquares(in);
        assertEquals(exp, actual);
    }

}
