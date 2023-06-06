package problems.p0200_0300.p0211_design_add_and_search_words_data_structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordDictionaryTest {

    @Test
    public void wordDictionary(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        wordDictionary.addWord("made");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search("made"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
        assertFalse(wordDictionary.search(".c"));
    }

}