package com.wordguesser.api.model.datasource;

import java.io.IOException;
import java.util.List;

public interface Datasource<T> {
    List<T> readWords() throws IOException;
}
