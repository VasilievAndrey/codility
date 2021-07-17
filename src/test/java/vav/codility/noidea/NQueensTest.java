package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NQueensTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(4, asList(asList(".Q..","...Q","Q...","..Q."), asList("..Q.","Q...","...Q",".Q.."))),
                Arguments.of(1, asList(asList("Q")))
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int in, List<List<String>> exp) {
        assertEquals(exp, new NQueens().solveNQueens(in));
    }
}
