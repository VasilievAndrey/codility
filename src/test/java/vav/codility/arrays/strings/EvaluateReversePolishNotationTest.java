package vav.codility.arrays.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}, 22),
                Arguments.of(new String[]{"4","13","5","/","+"}, 6),
                Arguments.of(new String[]{"2","1","+","3","*"}, 9)
        );
    }

    @MethodSource("getArguments")
    @ParameterizedTest
    public void test(String[] in, int exp) {
        assertEquals(exp, new EvaluateReversePolishNotation().evalRPN(in));
    }
}
