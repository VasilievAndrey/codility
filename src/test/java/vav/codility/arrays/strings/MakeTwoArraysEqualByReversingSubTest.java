package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MakeTwoArraysEqualByReversingSubTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}, true),
                Arguments.of(new int[]{7}, new int[]{7}, true),
                Arguments.of(new int[]{1, 12}, new int[]{12, 1}, true),
                Arguments.of(new int[]{3, 7, 9}, new int[]{3, 7, 11}, false)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int[] in2, boolean exp) {
        MakeTwoArraysEqualByReversingSub obj = new MakeTwoArraysEqualByReversingSub();
        assertEquals(exp, obj.canBeEqual(in, in2));
    }
}
