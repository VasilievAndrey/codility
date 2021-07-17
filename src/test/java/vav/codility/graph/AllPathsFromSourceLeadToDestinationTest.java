package vav.codility.graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class AllPathsFromSourceLeadToDestinationTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(3,new int[][] {{0,1}, {0,2}},0,2,false),
                Arguments.of(4,new int[][] {{0,1}, {0,3},{1,2}, {2,1}},0,3,false),
                Arguments.of(4,new int[][] {{0,1},{0,2},{1,3},{2,3}},0,3,true),
                Arguments.of(3,new int[][] {{0,1},{1,1},{1,2}},0,2, false),
                Arguments.of(2,new int[][] {{0,1},{1,1}},0,1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, int[][] edge, int source, int destination, boolean exp) {
        assertEquals(exp,new AllPathsFromSourceLeadToDestination().leadsToDestination(n, edge,source,destination));

    }

}
