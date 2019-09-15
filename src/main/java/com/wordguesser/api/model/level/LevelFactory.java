package com.wordguesser.api.model.level;

import com.wordguesser.api.model.datasource.Datasource;

import java.io.IOException;

public class LevelFactory {
    private Datasource datasource;

    public LevelFactory(Datasource datasource) {
        this.datasource = datasource;
    }

    public  Level generateLevel(int level) throws IOException {
        if (level == 0) {
            return  new LevelOne(datasource);
        }
        else if ( level == 1){
            return  new LevelTwo(datasource);
        }
        else if ( level == 2){
            return  new LevelThree(datasource);
        }

        else if ( level == 3){
            return  new LevelFour(datasource);
        }
        else {
            return  new LevelFive(datasource);
        }

    }
}
