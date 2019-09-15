package com.wordguesser.api.model.level;

public class NotEnoughWordsException extends  RuntimeException {
    public  NotEnoughWordsException(String message) {
        super(message);
    }
}
