package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ShuffleStringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("codeleet", new int[]{4,5,6,7,0,2,1,3}, "leetcode"),
                Arguments.of("abc", new int[]{0,1,2}, "abc"),
                Arguments.of("aiohn", new int[]{3,1,4,2,0}, "nihao"),
                Arguments.of("aaiougrt", new int[]{4,0,2,6,7,3,1,5}, "arigatou"),
                Arguments.of("art", new int[]{1,0,2}, "rat")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int[] ind, String exp) {
        assertEquals(exp, new ShuffleString().restoreString(in, ind));
    }
}
