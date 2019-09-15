package com.wordguesser.api.service;

import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.datasource.TextDataSource;
import com.wordguesser.api.model.level.Level;
import com.wordguesser.api.model.level.LevelFactory;
import com.wordguesser.api.model.word.Word;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LevelService {

    private   static final int  NO_OF_LEVELS = 5;

    private Datasource datasource = new TextDataSource("src/main/resources/uploads/words.txt");
    private LevelFactory levelFactory = new LevelFactory(datasource);

    public  List<Word> getWordList() throws IOException {
        List<Word> wordList = new ArrayList<>();
        for (int i = 0 ; i< NO_OF_LEVELS ; i++){
            Level levelObject = levelFactory.generateLevel(i);
            String selectedWord = levelObject.generateWord();
            int noOfAttempts =  levelObject.generateNoOfAttempts(selectedWord);
            Word word = new Word(selectedWord, noOfAttempts);
            wordList.add(word);
        }
        return  wordList;
    }
}
