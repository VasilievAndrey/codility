package vav.codility.dsf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class GenerateParenthesesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(3, new String[] {"((()))","(()())","(())()","()(())","()()()"}),
                Arguments.of(1, new String[] {"()"})
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(int n, String[] exp) {
        assertThat(new GenerateParentheses().generateParenthesis(n)).isEqualTo(exp);

    }


}
