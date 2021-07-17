package vav.codility.arrays.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOneTest {

    @Test
    public void test() {
        int[] ints = new PlusOne().plusOne(new int[]{4, 3, 2, 1});
        assertThat(ints).isEqualTo(new int[] {4,3,2,2});
    }
    @Test
    public void test1() {
        int[] ints = new PlusOne().plusOne(new int[]{0});
        assertThat(ints).isEqualTo(new int[] {1});
    }
   @Test
    public void test2() {
        int[] ints = new PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        assertThat(ints).isEqualTo(new int[] {9,8,7,6,5,4,3,2,1,1});
    }
   @Test
    public void test3() {
        int[] ints = new PlusOne().plusOne(new int[]{9,9,9,9});
        assertThat(ints).isEqualTo(new int[] {1,0,0,0,0});
    }

}
