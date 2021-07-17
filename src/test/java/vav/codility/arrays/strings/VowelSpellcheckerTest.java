package vav.codility.arrays.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelSpellcheckerTest {

    @Test
    public void test() {
        String[] exp = {"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"};
        String[] words = {"KiTe","kite","hare","Hare"};
        String[] queries = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        assertEquals(exp, new VowelSpellchecker().spellchecker(words, queries));
    }

    @Test
    public void test2() {
        String[] exp = {"ae"};
        String[] words = {"ae", "aa"};
        String[] queries = {"UU"};
        assertEquals(exp, new VowelSpellchecker().spellchecker(words, queries));
    }
    @Test
    public void test3() {
        String[] exp = {"YellOw"};
        String[] words = {"YellOw"};
        String[] queries = {"yollow"};
        assertEquals(exp, new VowelSpellchecker().spellchecker(words, queries));
    }
}
