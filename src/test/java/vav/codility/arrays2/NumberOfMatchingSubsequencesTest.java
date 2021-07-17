package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class NumberOfMatchingSubsequencesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("qlhxagxdqh", new String[] {"qlhxagxdq","qlhxagxdq","lhyiftwtut","yfzwraahab"}, 2),
                Arguments.of("abcde", new String[] {"a","bb","acd","ace"}, 3),
                Arguments.of("rwpddkvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvjubjgloeofnpjqlkdsqvruvabjrikfwronbrdyyjnakstqjac",
                        new String[] {"wpddkvbnn","lnagtva","kvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvju","rwpddkvbnnugln","gloeofnpjqlkdsqvruvabjrikfwronbrdyyj","vbgeinupkvgmgxeaaiuiyojmoqkahwvbpwugdainxciedbdkos","mspuhbykmmumtveoighlcgpcapzczomshiblnvhjzqjlfkpina","rgmliajkiknongrofpugfgajedxicdhxinzjakwnifvxwlokip","fhepktaipapyrbylskxddypwmuuxyoivcewzrdwwlrlhqwzikq","qatithxifaaiwyszlkgoljzkkweqkjjzvymedvclfxwcezqebx"},5),
                Arguments.of("dsahjpjauf", new String[] {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String w, String[] query, int exp) {
        assertEquals(exp,new NumberOfMatchingSubsequences().numMatchingSubseq(w, query));
    }
}
