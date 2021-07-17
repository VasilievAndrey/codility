package vav.codility.arrays2;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RangeSumQueryTest {

    @Test
    public void test() {
        RangeSumQuery sub = new RangeSumQuery(new int[] {1, 3, 5});

        assertEquals(9, sub.sumRange(0,2));
        sub.update(1,2);
        assertEquals(8, sub.sumRange(0,2));

    }

}
