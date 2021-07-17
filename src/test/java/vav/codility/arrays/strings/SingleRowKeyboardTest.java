package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleRowKeyboardTest {

    @Test
    public void calculateTime() {

        int count = SingleRowKeyboard.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba");
        System.out.println(count);
    }
}
