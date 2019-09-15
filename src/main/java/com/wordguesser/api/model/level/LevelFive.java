package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LevelFive extends Level {
    public LevelFive(Datasource datasource) throws IOException {
        super(datasource);
    }

    @Override
    List<String> generateLevelWordList() {
        List<String>  levelFiveWords = new ArrayList<>();

        for (String word : words){
            if (word.length() > 7) {
                levelFiveWords.add(word);
            }
        }
        return levelFiveWords;
    }

    @Override
    public int generateNoOfAttempts(String word) {
        return word.length();
    }
}

