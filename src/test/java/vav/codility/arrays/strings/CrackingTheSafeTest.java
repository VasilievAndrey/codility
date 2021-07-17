package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class CrackingTheSafeTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(1,2, "01"),
                Arguments.of(2,2, "00110")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, int k, String exp) {
        assertThat(new CrackingTheSafe().crackSafe(n,k)).isEqualTo(exp);
    }
}
