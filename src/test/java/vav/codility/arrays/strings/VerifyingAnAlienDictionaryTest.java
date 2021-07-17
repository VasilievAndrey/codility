package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class VerifyingAnAlienDictionaryTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"app", "apple"}, "abcdefghijklmnopqrstuvwxyz", true),
                Arguments.of(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true),
                Arguments.of(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz", false),
                Arguments.of(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, String order, boolean exp) {
        assertEquals(exp, new VerifyingAnAlienDictionary().isAlienSorted(in, order));
    }


}
