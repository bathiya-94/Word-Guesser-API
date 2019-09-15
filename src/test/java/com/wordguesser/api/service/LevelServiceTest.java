package com.wordguesser.api.service;
import com.wordguesser.api.model.word.Word;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LevelServiceTest {
    private static final Logger LOGGER = Logger.getLogger(LevelServiceTest.class.getName());
    @Test
    public  void LevelServiceTest() throws IOException {

        LevelService  levelService =  new LevelService();
        List<Word> wordList = levelService.getWordList();

        for (Word word :wordList){
            LOGGER.log(Level.INFO,word.getLetters());
        }

    }
}
