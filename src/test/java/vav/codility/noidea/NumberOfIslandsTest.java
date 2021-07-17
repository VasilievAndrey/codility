package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }, 1),
                Arguments.of(new char[][]{
                        {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                }, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(char[][] input, int exp) {
        assertEquals(exp, new NumberOfIslands().numIslands(input));
    }

}
