package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CountSmallerTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {5,2,6,1}, asList(2,1,1,0)),
                Arguments.of(new int[] {-1}, asList(0)),
                Arguments.of(new int[] {-1,-1}, asList(0,0))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, List<Integer> exp) {
        assertThat(new CountSmaller().countSmaller(in)).isEqualTo(exp);
    }
}
