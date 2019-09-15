package com.wordguesser.api.model.level;


import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LevelOne extends Level{
    public LevelOne(Datasource datasource) throws IOException {
        super(datasource);
    }

    @Override
    List<String> generateLevelWordList() {
        List<String>  levelOneWords = new ArrayList<>();

        for (String word : words){
            if (word.length() == 4) {
                levelOneWords.add(word);
            }
        }
        return  levelOneWords;
    }


    @Override
    public int generateNoOfAttempts(String word) {
        return word.length() +(5 -1)/2 ;
    }
}
