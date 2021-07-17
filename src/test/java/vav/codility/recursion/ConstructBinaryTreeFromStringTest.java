package vav.codility.recursion;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromStringTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("34(344)"),
                Arguments.of("-1"),
                Arguments.of("51(232)(434)"),
                Arguments.of("-4(2(3)(1))(6(5)(7))"),
                Arguments.of("4(2)(6)"),
                Arguments.of("4(2(3))(6(5)(7))"),
                Arguments.of("4(2(3)(1))(6(5)(7))"),
                Arguments.of("4(2(3)(1))(6(5))")
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void str2tree(String input) {
        ConstructBinaryTreeFromString.TreeNode treeNode = ConstructBinaryTreeFromString.str2tree(input);
        assertEquals(4, treeNode.val);
    }
}
