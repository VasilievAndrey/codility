package vav.codility.arrays.strings;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class AddStringsTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("9","99", "108")
//                Arguments.of("19","19", "38"),
//                Arguments.of("9","9", "18"),
//                Arguments.of("99","99", "198")
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void addStrings(String num1, String num2, String exp) {

       assertEquals( exp,AddStrings.addStrings(num1, num2));
    }
}
