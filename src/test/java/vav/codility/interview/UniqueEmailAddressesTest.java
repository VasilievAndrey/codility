package vav.codility.interview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import vav.codility.two.pointers.LongestMountain;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class UniqueEmailAddressesTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"}, 3),
                Arguments.of(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}, 2)
        );
    }


    @ParameterizedTest
    @MethodSource("getArguments")
    public void calcTest(String[] input, int expected) {
        assertEquals(expected, UniqueEmailAddresses.numUniqueEmails(input));
    }


}
