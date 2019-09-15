package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelFour;
import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LevelFourTest {
    @Test
    public  void returnsTrueWhenTheWordLengthIsSeven() throws IOException {
        Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
        Level levelFour = new LevelFour(datasource);
        String word = levelFour.generateWord();

        assertEquals(7, word.length());
    }
}
