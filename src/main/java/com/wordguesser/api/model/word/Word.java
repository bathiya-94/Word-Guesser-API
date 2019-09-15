package com.wordguesser.api.model.word;

public class Word {
    private  String letters;
    private  int noOfAttempts;

    public String getLetters() {
        return letters;
    }

    public Word(String letters, int noOfAttempts) {
        this.letters = letters;
        this.noOfAttempts = noOfAttempts;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public int getNoOfAttempts() {
        return noOfAttempts;
    }

    public void setNoOfAttempts(int noOfAttempts) {
        this.noOfAttempts = noOfAttempts;
    }
}
