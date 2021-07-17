package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MountainArrayTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {9,8,7,6,5,4,3,2,1,0}, false),
                Arguments.of(new int[] {0,1,2,3,4,5,6,7,8,9}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in ,boolean exp) {
        assertEquals(exp, new MountainArray().validMountainArray(in));
    }

}
