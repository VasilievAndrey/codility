package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;


public class MeetingSchedulerTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{216397070,363167701},{98730764,158208909},{441003187,466254040},{558239978,678368334},{683942980,717766451}},
                        new int[][] {{50490609,222653186},{512711631,670791418},{730229023,802410205},{812553104,891266775},{230032010,399152578}}, 456085, Arrays.asList(98730764,99186849)),
                Arguments.of(new int[][]{{10,60}}, new int[][] {{5,70},{21,50}}, 8, Arrays.asList(10,18)),
                Arguments.of(new int[][]{{10,60}}, new int[][] {{12,17},{21,50}}, 8, Arrays.asList(21,29)),
                Arguments.of(new int[][]{{10,50},{60,120},{140,210}}, new int[][] {{0,15},{60,70}}, 8, Arrays.asList(60,68)),
                Arguments.of(new int[][]{{10,50},{60,120},{140,210}}, new int[][] {{0,15},{60,70}}, 12, emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int[][] in1, int[][] in2, int dr, List<Integer> exp) {
        assertThat(new MeetingScheduler().minAvailableDuration(in1, in2, dr)).isEqualTo(exp);

    }


}
