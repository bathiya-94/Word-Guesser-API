package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelFive;
import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class LevelFiveTest {
    @Test
    public  void returnsTrueWhenTheWordMoreThenEight() throws IOException {
        Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
        Level levelFive = new LevelFive(datasource);
        String word = levelFive.generateWord();

        assertTrue(word.length() > 7);
    }
}
