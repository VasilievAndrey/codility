package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, new int[]{1,2}),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, new int[]{0,1,2,3,4})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void removeDuplicates(int[] input, int[] exp) {
        RemoveDuplicates.removeDuplicates(input);
        for (int i=0; i <exp.length; i++) {
            assertEquals(exp[i], input[i]);
        }
    }
}
