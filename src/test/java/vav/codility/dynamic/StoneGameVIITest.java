package vav.codility.dynamic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StoneGameVIITest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[]{5,3,1,4,2}, 6),
                Arguments.of(new int[]{7,90,5,1,100,10,10,2}, 122)
                );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[] in ,int exp) {
        assertEquals(exp, new StoneGameVII().stoneGameVII(in));
    }

}
