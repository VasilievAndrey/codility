package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MinimumDifficultyOfaJobScheduleTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[] {143,446,351,170,117,963,785,76,139,772,452,743,23,767,564,872,922,532,957,945,203,615,843,909,458,320,290,235,174,814,414,669,422,769,781,721,523,94,100,464,484,562,941},5,1839),
                Arguments.of(new int[] {11,111,22,222,33,333,44,444},6,843),
                Arguments.of(new int[] {6,5,4,3,2,1},2, 7),
                Arguments.of(new int[] {9,9,9},4,-1),
                Arguments.of(new int[] {1,1,1},3,3),
                Arguments.of(new int[] {7,1,7,1,7,1},3, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[] arr, int d, int exp) {
        assertEquals(exp, new MinimumDifficultyOfaJobSchedule().minDifficulty(arr, d));

    }

}
