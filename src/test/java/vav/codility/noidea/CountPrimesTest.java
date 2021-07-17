package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CountPrimesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(2, 0),
                Arguments.of(10, 4),
                Arguments.of(0, 0),
                Arguments.of(1, 0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int in, int exp) {
        assertThat(new CountPrimes().countPrimes(in)).isEqualTo(exp);
    }
}
