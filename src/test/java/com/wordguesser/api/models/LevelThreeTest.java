package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelThree;
import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LevelThreeTest {
    @Test
    public  void returnsTrueWhenTheWordLengthIsSix() throws IOException {
        Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
        Level levelThree = new LevelThree(datasource);
        String word = levelThree.generateWord();

        assertEquals(6, word.length());
    }
}

