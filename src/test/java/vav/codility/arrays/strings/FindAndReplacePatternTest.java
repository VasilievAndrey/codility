package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class FindAndReplacePatternTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[] {"abc","deq","mee","aqq","dkd","ccc"}, "abb", new String[] {"mee","aqq"}),
                Arguments.of(new String[] {"abc","cba","xyx","yxx","yyx"}, "abc", new String[] {"abc","cba"}),
                Arguments.of(new String[] {"a","b","c"}, "a", new String[] {"a","b","c"})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, String pat, String[] exp) {
        assertThat(new FindAndReplacePattern().findAndReplacePattern(in,pat)).isEqualTo(exp);
    }

}
