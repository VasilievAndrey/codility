package vav.codility.trie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchSuggestionsSystemTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[] {"code","codephone","coddle","coddles","codes"}, "coddle", asList("coddle","coddles","code"),asList("coddle","coddles","code"),asList("coddle","coddles","code"),asList("coddle","coddles"),asList("coddle","coddles"),asList("coddle","coddles")),
                Arguments.of(new String[] {"havana"}, "tatiana", asList(asList(),asList(),asList(),asList(),asList(),asList(),asList())),
                Arguments.of(new String[] {"mobile","mouse","moneypot","monitor","mousepad"}, "mouse", asList(asList("mobile","moneypot","monitor"), asList("mobile","moneypot","monitor"),asList("mouse","mousepad"),asList("mouse","mousepad"),asList("mouse","mousepad"))),
                Arguments.of(new String[] {"havana"}, "havana", asList(asList("havana"),asList("havana"),asList("havana"),asList("havana"),asList("havana"),asList("havana"))),
                Arguments.of(new String[] {"bags","baggage","banner","box","cloths"}, "bags", asList(asList("baggage","bags","banner"),asList("baggage","bags","banner"),asList("baggage","bags"),asList("bags")))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, String search, List<List<String>> exp) {
        assertThat(new SearchSuggestionsSystem().suggestedProducts(in, search)).isEqualTo(exp);
    }

}
