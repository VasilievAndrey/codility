package vav.codility.noidea;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class OpenTheLockTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[] {"0201","0101","0102","1212","2002"}, "0202", 6),
                Arguments.of(new String[] {"8888"}, "0009", 1),
                Arguments.of(new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888", -1),
                Arguments.of(new String[] {"0000"}, "8888", -1)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String[] arr, String target, int exp) {
        assertEquals(exp, new OpenTheLock().openLock(arr, target));

    }
}
