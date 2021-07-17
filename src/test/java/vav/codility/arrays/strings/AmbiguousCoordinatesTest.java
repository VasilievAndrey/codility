package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class AmbiguousCoordinatesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("(123)", asList("(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)")),
                Arguments.of("(00011)", asList("(0.001, 1)", "(0, 0.011)")),
                Arguments.of("(0123)", asList("(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)")),
                Arguments.of("(100)", asList("(10, 0)"))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, List<String> exp) {
        assertThat(new AmbiguousCoordinates().ambiguousCoordinates(in)).isEqualTo(exp);
    }
}
