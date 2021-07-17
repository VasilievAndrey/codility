package vav.codility.trie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class ShortEncodingofWordsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of( new String[] {"time", "me", "bell"}, 10),
                Arguments.of( new String[] {"t"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, int exp) {
        assertThat(new ShortEncodingofWords().minimumLengthEncoding(in)).isEqualTo(exp);
    }

}
