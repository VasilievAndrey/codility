package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class OddEvenJumpTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{10,13,12,14,15}, 2),
                Arguments.of(new int[]{2,3,1,1,4},3),
                Arguments.of(new int[]{5,1,3,4,2}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int exp) {
        assertEquals(exp, new OddEvenJump().oddEvenJumps(in));
    }

}
