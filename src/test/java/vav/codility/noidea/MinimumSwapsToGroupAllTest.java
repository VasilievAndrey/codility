package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MinimumSwapsToGroupAllTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,0,0,1,1,1}, 1),
                Arguments.of(new int[] {1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1}, 30),
                Arguments.of(new int[] {1,0,1,0,1,1,0,1}, 2),
                Arguments.of(new int[] {0,0,0,1,0}, 0),
                Arguments.of(new int[] {1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,1}, 8),
                Arguments.of(new int[] {1,0,1,0,1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] mtrx, int exp) {
        assertEquals(exp, new MinimumSwapsToGroupAll().minSwaps(mtrx));
    }

}
