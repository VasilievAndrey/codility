package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ReverseOnlyVowelsTest {

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("hello","holle"),
                Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void test(String in, String exp){
        assertEquals(exp,new ReverseOnlyVowels().reverseVowels(in));
    }

}
