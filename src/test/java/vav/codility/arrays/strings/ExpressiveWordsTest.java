package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ExpressiveWordsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("aaa", new String[] {"aaaa"}, 0),
                Arguments.of("zzzzzyyyyy", new String[] {"zzyy","zy","zyy"}, 3),
                Arguments.of("heeellooo", new String[] {"hello", "hi", "helo"}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String[] words, int exp) {
        assertEquals(exp,new ExpressiveWords().expressiveWords(in,words));
    }
}
