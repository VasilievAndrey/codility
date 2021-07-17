package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StringPathToCanonicalTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("/../", "/"),
                Arguments.of("/home/","/home"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/a/./b/../../c/", "/c")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String exp) {
        assertEquals(exp, new StringPathToCanonical().simplifyPath(in));
    }

}
