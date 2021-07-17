package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class IsomorphicTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("badc","baba", false),
                Arguments.of("foo", "bar", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String s, String t, boolean exp) {
        assertEquals(exp, new Isomorphic().isIsomorphic(s,t));
    }

}
