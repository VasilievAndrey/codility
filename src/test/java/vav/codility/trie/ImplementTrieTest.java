package vav.codility.trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementTrieTest {

    @Test
    public void tes() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // return True
        assertFalse(trie.search("app"));     // return False
        assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        assertTrue(trie.search("app"));     // return True
    }

}
