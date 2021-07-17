package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TrieNodeSearchTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(asList("bags",
                        "baggage",
                        "banner",
                        "box",
                        "cloths"), "bags", asList(asList()))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(List<String> words, String query, List<List<String>> ans) {
        assertThat(TrieNodeSearch.searchSuggestions(words, query)).isEqualTo(ans);
    }

}
