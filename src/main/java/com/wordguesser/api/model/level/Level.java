package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public abstract  class Level {
    protected  int noOfAttempts;
    protected  List<String> words;


    Level(Datasource datasource) throws IOException {
        this.words = datasource.readWords() ;
    }

    public  String generateWord(){
        List<String> levelWordList = generateLevelWordList();
        if (levelWordList.isEmpty()){
            throw new NotEnoughWordsException("Not enough words for a level");
        }
        else{
            Random random = new Random();
            int n = random.nextInt(levelWordList.size());
            return  levelWordList.get(n);
        }
    }

    abstract List<String> generateLevelWordList();
    public  abstract  int generateNoOfAttempts(String word);
}
