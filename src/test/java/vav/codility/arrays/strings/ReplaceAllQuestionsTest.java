package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ReplaceAllQuestionsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("??yw?ipkj?", "acywaipkja"),
                Arguments.of("ubv?w", "ubvaw"),
                Arguments.of("j?qg??b", "jaqgacb")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String exp) {
        assertEquals(exp, new ReplaceAllQuestions().modifyString(in));
    }
}
