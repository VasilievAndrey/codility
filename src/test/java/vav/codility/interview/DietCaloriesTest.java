package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DietCaloriesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{6,13,8,7,10,1,12,11}, 6, 5 ,37, 3),
                Arguments.of(new int[]{1,2,3,4,5}, 1,3,3,0),
                Arguments.of(new int[]{3,2}, 2,0,1,1),
                Arguments.of(new int[]{6,5,0,0}, 2,1,5,0)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in, int k, int lower, int upper, int exp) {
        assertEquals(exp, new DietCalories().dietPlanPerformance(in,k, lower, upper));

    }
}
