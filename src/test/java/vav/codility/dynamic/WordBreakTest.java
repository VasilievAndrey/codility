package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class WordBreakTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("ab", asList("a","b"), true),
                Arguments.of("leetcode", asList("leet","code"), true),
                Arguments.of("applepenapple", asList("apple","pen"), true),
                Arguments.of("catsandog", asList("cats","dog","sand","and","cat"), false)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String s, List<String> ls, boolean exp) {
        assertEquals(exp, new WordBreak().wordBreak(s, ls));
    }


}
