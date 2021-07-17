package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StringCompressionIITest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("aaabcccd", 2, 4),
                Arguments.of("aabbaa", 2,2),
                Arguments.of("aaaaaaaaaaa", 0, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int k, int exp) {
        assertEquals(new StringCompressionII().getLengthOfOptimalCompression(in, k), exp);
    }

}
