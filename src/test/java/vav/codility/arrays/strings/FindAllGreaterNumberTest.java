package vav.codility.arrays.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FindAllGreaterNumberTest {

    @Test
    public void test() {
        int[] ints = new FindAllGreaterNumber().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        assertThat(ints).isEqualTo(new int[]{-1,3,-1});
    }

}
