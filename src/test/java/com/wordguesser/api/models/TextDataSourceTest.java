package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextDataSourceTest {
    private static final Logger LOGGER = Logger.getLogger(TextDataSourceTest.class.getName());
    @Test
    public void printWordList() throws IOException {
        List<String> words;
        TextDataSource source = new TextDataSource("src/main/resources/uploads/words.txt");
        words = source.readWords();
        for (String word :
                words) {
            LOGGER.log(Level.INFO,word);

        }
    }
}
