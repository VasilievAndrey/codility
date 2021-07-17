package vav.codility.interview;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}, 6),
                Arguments.of(new int[]{4,2,0,3,2,5}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void trap(int[] input, int result) {
        assertEquals(result, TrappingRainWater.trap(input));
    }
}
