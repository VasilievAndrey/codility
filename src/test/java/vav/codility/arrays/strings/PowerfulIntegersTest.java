package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerfulIntegersTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
//                Arguments.of(2, 3, 10, Arrays.asList(2, 3, 4, 5, 7, 9, 10)),
                Arguments.of(2, 1, 10, Arrays.asList(2, 3, 5, 9)),
                Arguments.of(2, 1, 10, Arrays.asList(2, 3, 5, 9)),
                Arguments.of(0, 0, 10, Arrays.asList(2, 3, 5, 9))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int a, int b, int c, List<Integer> exp) {
        List<Integer> actual = new PowerfulIntegers().powerfulIntegers(a, b, c);
        assertThat(actual).isEqualTo(exp);
    }

}
