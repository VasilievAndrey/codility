package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MatchingPairsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abcde","adcbe",5),
                Arguments.of("abcd","abcd",2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String w1, String w2, int exp) {
        assertEquals(exp, new MatchingPairs().matchingPairs(w1,w2));
    }
}
