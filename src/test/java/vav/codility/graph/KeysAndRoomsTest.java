package vav.codility.graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class KeysAndRoomsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(Arrays.asList(1),Arrays.asList(1,1)), false),
                Arguments.of(Arrays.asList(Arrays.asList(1),Arrays.asList(2),Arrays.asList(3),Arrays.asList()), true),
                Arguments.of(Arrays.asList(Arrays.asList(1,3),Arrays.asList(3,0,1),Arrays.asList(2),Arrays.asList(0)), false),
                Arguments.of(Arrays.asList(Arrays.asList(1),Arrays.asList(),Arrays.asList(0,3),Arrays.asList(1)), false)
        );
    }


    @MethodSource("getArguments")
    @ParameterizedTest
    public void canVisit(List<List<Integer>> input, boolean exp) {
        assertEquals(exp, new KeysAndRooms().canVisitAllRooms(input));
    }

}
