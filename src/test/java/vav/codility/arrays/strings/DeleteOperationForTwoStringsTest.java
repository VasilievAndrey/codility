package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DeleteOperationForTwoStringsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("dinitrophenylhydrazine","acetylphenylhydrazine", 2),
                Arguments.of("sea", "eat", 2),
                Arguments.of("leetcode", "etco", 4)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void addStrings(String word, String word2, int exp) {
        assertEquals(exp,new DeleteOperationForTwoStrings().minDistance(word, word2));
    }
}
