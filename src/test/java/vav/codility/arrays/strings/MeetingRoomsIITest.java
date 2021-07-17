package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MeetingRoomsIITest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{13,15},{1,13}}, 1),
                Arguments.of(new int[][]{{0,30},{5,10},{15,20}}, 2),
                Arguments.of(new int[][]{{7,10},{2,4}}, 1)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(int[][] in, int exp) {
        assertEquals(exp, new MeetingRoomsII().minMeetingRooms(in));
    }

}
