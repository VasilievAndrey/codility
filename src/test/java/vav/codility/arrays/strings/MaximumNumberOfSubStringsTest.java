package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class MaximumNumberOfSubStringsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("adefaddaccc", asList("e","f","ccc")),
                Arguments.of("abbaccd", asList("d","bb","cc"))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String s, List<String> ans) {
        assertThat(new MaximumNumberOfSubStrings().maxNumOfSubstrings(s)).isEqualTo(ans);
    }

}
