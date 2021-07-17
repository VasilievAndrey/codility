package vav.codility.bfs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class MinimumKnightMovesTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(300,0,135),
                Arguments.of(270,-21,135),
                Arguments.of(2,1,1),
                Arguments.of(5,5,4),
                Arguments.of(2,112,56)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int x, int y, int exp) {
        assertEquals(exp,new MinimumKnightMoves().minKnightMoves(x,y));
    }

}
