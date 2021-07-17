package vav.codility.arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class CandyTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,3,2,2,1}, 7),
                Arguments.of(new int[] {1,0,2}, 5),
                Arguments.of(new int[] {1,2,2}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] in, int exp) {
        assertEquals(exp, new Candy().candy(in));
    }

}
