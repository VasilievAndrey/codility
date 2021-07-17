package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class WiggleSubsequenceTest {


    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {3,3,3,2,5}, 3),
                Arguments.of(new int[] {1,17,5,10,13,15,10,5,16,8}, 7),
                Arguments.of(new int[] {1,7,4,9,2,5}, 6),
                Arguments.of(new int[] {1,2,3,4,5,6,7,8,9}, 2)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void wiggleMaxLength(int[] input, int exp) {
        assertEquals(exp, new WiggleSubsequence().wiggleMaxLength(input));
    }
}
