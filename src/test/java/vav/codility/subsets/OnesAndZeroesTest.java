package vav.codility.subsets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class OnesAndZeroesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"10","0001","111001","1","0"},3,4, 3),
                Arguments.of(new String[]{"0","0","1","1"},2,2, 4),
                Arguments.of(new String[]{"10","0001","111001","1","0"},5, 3, 4),
                Arguments.of(new String[]{"10","0","1"}, 1,1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void calcTest(String[] input, int m, int n, int exp)
    {
        assertEquals(exp, new OnesAndZeroes().findMaxForm(input, m, n));
    }


}
