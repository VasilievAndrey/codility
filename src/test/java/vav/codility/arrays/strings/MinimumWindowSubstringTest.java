package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("abc", "c", "c"),
                Arguments.of("abc", "a", "a"),
                Arguments.of("abc", "b", "b"),
                Arguments.of("wegdtzwabazduwwdysdetrrctotpcepalxdewzezbfewbabbseinxbqqplitpxtcwwhuyntbtzxwzyaufihclztckdwccpeyonumbpnuonsnnsjscrvpsqsftohvfnvtbphcgxyumqjzltspmphefzjypsvugqqjhzlnylhkdqmolggxvneaopadivzqnpzurmhpxqcaiqruwztroxtcnvhxqgndyozpcigzykbiaucyvwrjvknifufxducbkbsmlanllpunlyohwfsssiazeixhebipfcdqdrcqiwftutcrbxjthlulvttcvdtaiwqlnsdvqkrngvghupcbcwnaqiclnvnvtfihylcqwvderjllannflchdklqxidvbjdijrnbpkftbqgpttcagghkqucpcgmfrqqajdbynitrbzgwukyaqhmibpzfxmkoeaqnftnvegohfudbgbbyiqglhhqevcszdkokdbhjjvqqrvrxyvvgldtuljygmsircydhalrlgjeyfvxdstmfyhzjrxsfpcytabdcmwqvhuvmpssingpmnpvgmpletjzunewbamwiirwymqizwxlmojsbaehupiocnmenbcxjwujimthjtvvhenkettylcoppdveeycpuybekulvpgqzmgjrbdrmficwlxarxegrejvrejmvrfuenexojqdqyfmjeoacvjvzsrqycfuvmozzuypfpsvnzjxeazgvibubunzyuvugmvhguyojrlysvxwxxesfioiebidxdzfpumyon", "ozgzyywxvtublcl", "tcnvhxqgndyozpcigzykbiaucyvwrjvknifufxducbkbsmlanl"),
                Arguments.of("aaaaaaaaaaaabbbbbcdd", "abcdd", "abbbbbcdd"),
                Arguments.of("bbaa", "aba", "baa"),
                Arguments.of("a", "b", ""),
                Arguments.of("abc", "ac", "abc"),
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                Arguments.of("ab", "a", "a"),
                Arguments.of("aa", "aa", "aa")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void minWindow(String inputS,String inputT, String exp) {
        assertEquals( exp,MinimumWindowSubstring.minWindow(inputS ,inputT));
    }

}
