package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LongestStringChainTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"ksqvsyq","ks","kss","czvh","zczpzvdhx","zczpzvh","zczpzvhx","zcpzvh","zczvh","gr","grukmj","ksqvsq","gruj","kssq","ksqsq","grukkmj","grukj","zczpzfvdhx","gru"}, 7),
                Arguments.of(new String[]{"a","b","ab","bac"}, 2),
                Arguments.of(new String[]{"a","b","ba","bca","bda","bdca"}, 4),
                Arguments.of(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, int exp) {
        assertEquals(exp, new LongestStringChain().longestStrChain(in));
    }
}
