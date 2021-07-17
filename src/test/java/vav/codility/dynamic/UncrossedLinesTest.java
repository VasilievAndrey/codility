package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class UncrossedLinesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,1,2,1,2}, new int[]{1,3,2,3,1},3),
                Arguments.of(new int[] {2,5,1,2,5}, new int[]{10,5,2,1,5,2},3),
                Arguments.of(new int[] {1,4,2}, new int[]{1,2,4},2),
                Arguments.of(new int[] {1,3,7,1,7,5}, new int[]{1,9,2,5,1},2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] num, int[] num2, int exp) {
        assertEquals(exp, new UncrossedLines().maxUncrossedLines(num, num2));
    }
}
