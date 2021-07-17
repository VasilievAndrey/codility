package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CanMakePalindromeFromSubstringTest {


    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("hunu", new int[][]{{0,3,1},{2,3,0},{3,3,1},{0,3,2},{1,3,3},{2,3,1},{3,3,1},{0,3,0},{1,1,1},{2,3,0},{3,3,1},{1,1,1},{1,1,1}}, asList(true,false,true,true,true,true,true,false,true,false,true,true,true)),
                Arguments.of("lyb", new int[][]{{0,1,0}, {2,2,1}}, asList(false,true)),
                Arguments.of("abcda", new int[][]{{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}}, asList(true,false,false,true,true))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String s, int[][] query, List<Boolean> exp) {

        List<Boolean> res = new CanMakePalindromeFromSubstring().canMakePaliQueries(s, query);
        assertThat(res).isEqualTo(exp);
    }
}
