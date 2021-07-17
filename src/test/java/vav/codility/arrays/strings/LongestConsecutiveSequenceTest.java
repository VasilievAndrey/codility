package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,2,0,1}, 3),
                Arguments.of(new int[] {100,4,200,1,3,2}, 4),
                Arguments.of(new int[] {0,3,7,2,5,8,4,6,0,1}, 9)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int exp) {
        assertEquals(exp, new LongestConsecutiveSequence().longestConsecutive(in));
    }

}
