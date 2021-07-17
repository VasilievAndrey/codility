package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class TriangleTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(

                Arguments.of(asList(asList(-1),asList(2,3),asList(1,-1,-3)),-1),
                Arguments.of(asList(asList(2),asList(3,4),asList(6,5,7),asList(4,1,8,3)),11),
                Arguments.of(asList(asList(-10)), -10)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(List<List<Integer>> in, int exp) {
        assertEquals(exp, new Triangle().minimumTotal(in));
    }

}
