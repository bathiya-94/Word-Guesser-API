package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LevelThree  extends  Level{
    public LevelThree(Datasource datasource) throws IOException {
        super(datasource);
    }

    @Override
    List<String> generateLevelWordList() {
        List<String>  levelThreeWords = new ArrayList<>();

        for (String word : words){
            if (word.length() == 6) {
                levelThreeWords.add(word);
            }
        }
        return  levelThreeWords;
    }

    @Override
    public int generateNoOfAttempts(String word)
    {
        return word.length() +(5 -3)/2 ;
    }
}