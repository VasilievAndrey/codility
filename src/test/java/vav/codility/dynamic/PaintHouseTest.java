package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PaintHouseTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][] {{17,2,17}, {16,16,5}, {14,3,19}}, 10),
                Arguments.of(new int[][] {{7,6,2}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] costs, int exp) {
        assertEquals(exp, new PaintHouse().minCost(costs));
    }

}
