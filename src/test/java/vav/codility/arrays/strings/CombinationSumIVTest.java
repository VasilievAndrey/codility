package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CombinationSumIVTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {2,1,3},35, 1132436852),
                Arguments.of(new int[] {1,2,3},4, 7),
                Arguments.of(new int[]{9},3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int tar, int exp) {
        assertEquals(exp, new CombinationSumIV().combinationSum4(in, tar));
    }

}
