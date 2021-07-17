package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class JumpGameVITest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {10,-5,-2,4,0,3}, 3, 17),
                Arguments.of(new int[] {1,-5,-20,4,-1,3,-6,-3}, 2, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int k, int exp) {
        assertEquals(exp, new JumpGameVI().maxResult(in, k));
    }

}
