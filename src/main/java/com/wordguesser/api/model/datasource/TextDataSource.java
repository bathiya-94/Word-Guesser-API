package com.wordguesser.api.model.datasource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

public class TextDataSource implements Datasource {
    private  String path;


    public TextDataSource(String path) {
        this.path = path;
    }

    @Override
    public List<String> readWords() throws IOException {

        return Files.readAllLines(Paths.get(path));

    }
}
