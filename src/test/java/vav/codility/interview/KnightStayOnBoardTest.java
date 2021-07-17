package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KnightStayOnBoardTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(3,2,0,0,0.06250),
                Arguments.of(1,0,0,0,1.0000)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, int k, int row, int col, double exp) {
        assertEquals(exp, new KnightStayOnBoard().knightProbability(n,k,row,col));
    }

}
