package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayOfAnagramsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("cbaebabacd","abc", Arrays.asList(0,6)),
                Arguments.of("abacbabc", "abc", Arrays.asList(1,2,3,5)),
                Arguments.of("abab","ab", Arrays.asList(0,1,2))
                );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String s, String t, List<Integer> exp) {
        assertThat(new ArrayOfAnagrams().findAnagrams(s,t)).isEqualTo(exp);

    }

}
