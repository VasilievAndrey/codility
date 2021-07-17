package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class GlobalAndLocalInversionsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 0}, false),
                Arguments.of(new int[]{1, 0, 2}, true),
                Arguments.of(new int[]{1, 2, 0}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] num1, boolean exp) {
        assertEquals(exp, new GlobalAndLocalInversions().isIdealPermutation(num1));
    }
}
