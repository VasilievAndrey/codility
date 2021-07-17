package vav.codility.booleanlogic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class BulbSwitcherIVTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("10111", 3),
                Arguments.of("101", 3),
                Arguments.of("0000", 0),
                Arguments.of("001011101", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, int exp) {
        assertEquals(exp, new BulbSwitcherIV().minFlips(in));

    }

}
