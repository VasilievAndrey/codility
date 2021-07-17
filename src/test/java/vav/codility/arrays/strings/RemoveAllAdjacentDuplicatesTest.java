package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RemoveAllAdjacentDuplicatesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("pbbcggttciiippooaais", 2, "ps"),
                Arguments.of("nnwssswwnvbnnnbbqhhbbbhmmmlllm", "3", "vqm"),
                Arguments.of("deeedbbcccbdaa", 3, "aa"),
                Arguments.of("abcd", 2, "abcd")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int k, String exp) {
        assertEquals(exp, new RemoveAllAdjacentDuplicates().removeDuplicates(in, k));

    }
}
