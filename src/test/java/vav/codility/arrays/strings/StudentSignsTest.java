package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentSignsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{2,1}, new int[] {2,2}),
                Arguments.of(new int[]{1,2}, new int[] {1,1})
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int[] exp) {
        assertThat(new StudentSigns().findSignatureCounts(in)).isEqualTo(exp);
    }

}
