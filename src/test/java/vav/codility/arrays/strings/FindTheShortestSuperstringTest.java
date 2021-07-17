package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FindTheShortestSuperstringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of( new String[] {"alex","loves","leetcode"}, "alexlovesleetcode"),
                Arguments.of( new String[] {"catg","ctaagt","gcta","ttca","atgcatc"}, "gctaagttcatgcatc")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, String exp) {
        assertEquals(exp, new FindTheShortestSuperstring().dfs(in));
    }
}
