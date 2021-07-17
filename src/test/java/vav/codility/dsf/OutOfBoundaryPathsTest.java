package vav.codility.dsf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class OutOfBoundaryPathsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(2,2,2,0,0,6),
                Arguments.of(1,3,3,0,1,12)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int m, int n, int max, int startR, int startC, int exp) {
        assertEquals(exp, new OutOfBoundaryPaths().findPaths(m,n,max, startR, startC));

    }
}
