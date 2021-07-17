package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Lock2Test {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(10, 4, new int[] {9, 4, 4, 8}, 11),
                Arguments.of(3, 3, new int[] {1, 2, 3}, 2)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, int m, int[] arr, int exp) {
        assertEquals(exp, new Lock2().getMinCodeEntryTime(n,m,arr));
    }

}
