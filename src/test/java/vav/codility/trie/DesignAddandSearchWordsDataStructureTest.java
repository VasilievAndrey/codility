package vav.codility.trie;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignAddandSearchWordsDataStructureTest {

    @Test
    public void test() {
        DesignAddandSearchWordsDataStructure wordDictionary = new DesignAddandSearchWordsDataStructure();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad")); // return False
        assertTrue(wordDictionary.search("bad")); // return True
        assertTrue(wordDictionary.search(".ad")); // return True
        assertTrue(wordDictionary.search("b..")); // return True
    }
    @Test
    public void test3() {
        DesignAddandSearchWordsDataStructure wordDictionary = new DesignAddandSearchWordsDataStructure();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");
        assertFalse(wordDictionary.search("a")); // return False
        assertFalse(wordDictionary.search(".at")); // return True
        wordDictionary.addWord("bat");
        assertTrue(wordDictionary.search(".at")); // return True
        assertTrue(wordDictionary.search("an.")); // return True
        assertFalse(wordDictionary.search("a.d.")); // return True
        assertFalse(wordDictionary.search("b.")); // return True
        assertTrue(wordDictionary.search("a.d")); // return True
        assertFalse(wordDictionary.search(".")); // return True
    }
    @Test
    public void test2() {
        DesignAddandSearchWordsDataStructure wordDictionary = new DesignAddandSearchWordsDataStructure();
        wordDictionary.addWord(null);
        assertFalse(wordDictionary.search("a"));
    }
}
