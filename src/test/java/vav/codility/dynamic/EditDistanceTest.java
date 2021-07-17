package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("horse", "ros", 3),
                Arguments.of("intention", "execution", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String w1, String w2, int exp) {
        assertEquals(exp, new EditDistance().minDistance(w1,w2));
    }
}
