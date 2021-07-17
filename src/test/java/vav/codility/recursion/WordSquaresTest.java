package vav.codility.recursion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordSquaresTest {

    @Test
    public void wordSquares0() {
        String[] input = {"a"};

        List<List<String>> lists = WordSquares.wordSquares(input);
        System.out.println(lists);
    }
    @Test
    public void wordSquares() {
        String[] input = {"area","lead","wall","lady","ball"};

        List<List<String>> lists = WordSquares.wordSquares(input);
        System.out.println(lists);
    }
    @Test
    public void wordSquares2() {
        String[] input = {"abat","baba","atan","atal"};

        List<List<String>> lists = WordSquares.wordSquares(input);
        System.out.println(lists);
    }
}
