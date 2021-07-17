package vav.codility.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8, 20)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] input, int target, int exp) {
        assertEquals(exp, new ThreeSum().threeSumMulti(input, target));
    }

}
