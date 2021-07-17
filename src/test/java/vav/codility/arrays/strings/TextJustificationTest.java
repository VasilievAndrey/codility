package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class TextJustificationTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16,
                        asList("What   must   be",
                                "acknowledgment  ",
                                "shall be        ")),
                Arguments.of(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16,
                        asList("This    is    an",
                                "example  of text",
                                "justification.  ")),
                Arguments.of(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20,
                        asList("Science  is  what we",
                                "understand      well",
                                "enough to explain to",
                                "a  computer.  Art is",
                                "everything  else  we",
                                "do                  "))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, int len, List<String> exp) {
        assertEquals(exp, new TextJustification().fullJustify(in, len));
    }

}
