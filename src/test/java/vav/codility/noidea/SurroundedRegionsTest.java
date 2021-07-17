package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SurroundedRegionsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new char[][]{
                                {'X', 'X', 'X', 'X'},
                                {'X', 'O', 'O', 'X'},
                                {'X', 'X', 'O', 'X'},
                                {'X', 'O', 'X', 'X'},
                        },
                        new char[][]{
                                {'X', 'X', 'X', 'X'},
                                {'X', 'X', 'X', 'X'},
                                {'X', 'X', 'X', 'X'},
                                {'X', 'O', 'X', 'X'}
                        }
                ),
                Arguments.of(new char[][]{
                                {'X'},
                        },
                        new char[][]{
                                {'X'}
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(char[][] input, char[][] exp) {
        new SurroundedRegions().solve(input);
        assertEquals(exp, input);
    }
}
