package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PalindromicSubstringsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg", 77),
                Arguments.of("aaa", 6),
                Arguments.of("abc", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String s, int exp) {
        assertEquals(exp, new PalindromicSubstrings().countSubstrings(s));
    }
}
