package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelOne;
import com.wordguesser.api.model.datasource.TextDataSource;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class LevelOneTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public  void returnsTrueWhenTheWordLengthIsFour() throws IOException {
        Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
        Level levelOne = new LevelOne(datasource);
        String word = levelOne.generateWord();

        assertEquals(4, word.length());
    }


}
