package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class StringWithOptionsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("a", new String[] {"a"}),
                Arguments.of("abcd", new String[] {"abcd"}),
                Arguments.of("{a,b}c{d,e}f", new String[] {"acdf","acef","bcdf","bcef"})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String[] exp) {
        assertThat(new StringWithOptions().expand(in)).isEqualTo(exp);
    }
}
