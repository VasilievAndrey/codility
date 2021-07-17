package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class ReorderDataInLogFilesTest {
    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[] {"j je", "b fjt", "7 zbr", "m le", "o 33"}, new String[] {"b fjt","j je","m le","7 zbr","o 33"}),
                Arguments.of(new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"}, new String[] {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"})
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, String[] exp) {
        assertThat(new ReorderDataInLogFiles().reorderLogFiles(in)).isEqualTo(exp);
    }
}
