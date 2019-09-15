package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LevelFour extends Level {
    public LevelFour(Datasource datasource) throws IOException {
        super(datasource);
    }

    @Override
    List<String> generateLevelWordList() {
        List<String>  levelFourWords = new ArrayList<>();

        for (String word : words){
            if (word.length() == 7) {
                levelFourWords.add(word);
            }
        }
        return  levelFourWords;
    }

    @Override
    public int generateNoOfAttempts(String word) {

        return word.length();
    }
}