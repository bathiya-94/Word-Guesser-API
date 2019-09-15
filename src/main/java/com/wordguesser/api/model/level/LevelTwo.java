package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LevelTwo extends Level {
    public LevelTwo(Datasource datasource) throws IOException {
        super(datasource);
    }

    @Override
    List<String> generateLevelWordList() {
        List<String>  levelTwoWords = new ArrayList<>();

        for (String word : words){
            if (word.length() == 5) {
                levelTwoWords.add(word);
            }
        }
        return  levelTwoWords;
    }

    @Override
    public int generateNoOfAttempts(String word){
    return word.length() +(5-2)/2 ;
    }
}
