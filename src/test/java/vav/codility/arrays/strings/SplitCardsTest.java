package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SplitCardsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,1,2,2,2,2,2,2}, true),
                Arguments.of(new int[]{0,0,0,0,1,1,2,2,3,3}, true),
                Arguments.of(new int[]{1,2,3,4,4,3,2,1}, true),
                Arguments.of(new int[]{1,1,1,2,2,2,3,3}, false),
                Arguments.of(new int[]{1}, false),
                Arguments.of(new int[]{1,1}, true)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in ,boolean exp) {
        assertEquals(exp, new SplitCards().hasGroupsSizeX(in));
    }

    @Test
    public void test() {
        System.out.println(gcd(2,5));
    }

    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a%b): a;
    }
}
