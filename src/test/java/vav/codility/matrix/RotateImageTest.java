package vav.codility.matrix;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateImageTest {

    @Test
    public void test() {
        int[][] in = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}};
        int[][] exp = new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        new RotateImage().rotate(in);
        assertThat(in).isEqualTo(exp);
    }

}
