package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FindDuplicateFileInSystemTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[] {"root/a 1.txt(FB) 2.txt(a)","root/c 3.txt(Ea)","root/c/d 4.txt(b)","root 4.txt(c)"}, asList()),
                Arguments.of(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"},
                        asList(asList("root/a/2.txt","root/c/d/4.txt","root/4.txt"), asList("root/a/1.txt","root/c/3.txt"))),
                Arguments.of(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"},
                        asList(asList("root/a/2.txt","root/c/d/4.txt"), asList("root/a/1.txt","root/c/3.txt")))
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] in, List<List<String>> exp) {
        assertThat(new FindDuplicateFileInSystem().findDuplicate(in)).isEqualTo(exp);
    }

}
