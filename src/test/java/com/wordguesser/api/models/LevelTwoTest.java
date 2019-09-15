package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelTwo;
import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LevelTwoTest {
    @Test
    public  void returnsTrueWhenTheWordLengthIsFive() throws IOException {
        Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
        Level levelTwo = new LevelTwo(datasource);
        String word = levelTwo.generateWord();

        assertEquals(5, word.length());
    }
}
