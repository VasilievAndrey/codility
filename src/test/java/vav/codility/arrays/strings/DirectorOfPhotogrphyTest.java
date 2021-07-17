package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DirectorOfPhotogrphyTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(8, ".PBAAP.B",1,3,3),
                Arguments.of(5, "APABA",2,3,0),
                Arguments.of(5, "APABA",1,2,1)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, String S, int x, int y, long exp) {
        assertEquals(exp, new DirectorOfPhotogrphy().getArtisticPhotographCount(n, S, x,y));
    }
}
