package vav.codility.backtracking;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CourseScheduleIIITest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of( new int[][] {{7,17},{3,12},{10,20},{9,10},{5,20},{10,19},{4,18}}, 4),
                Arguments.of( new int[][] {{5,11},{3,5},{10,20},{4,20},{10,16}}, 3),
                Arguments.of( new int[][] {{5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}}, 5),
                Arguments.of( new int[][] {{1,2},{2,3}}, 2),
                Arguments.of( new int[][] {{100,200},{200,1300},{1000,1250},{2000,3200}}, 3),
                Arguments.of( new int[][] {{1,2}}, 1),
                Arguments.of( new int[][] {{3,2}, {4,3}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] in, int exp) {
        assertEquals(exp, new CourseScheduleIII().scheduleCourse(in));

    }

}
