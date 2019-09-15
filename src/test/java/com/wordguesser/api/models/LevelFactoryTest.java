package com.wordguesser.api.models;


import com.wordguesser.api.model.datasource.Datasource;
import com.wordguesser.api.model.datasource.TextDataSource;
import com.wordguesser.api.model.level.*;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;


public class LevelFactoryTest {
    private  static  final  String RESOURCE_PATH = "src/main/resources/uploads/words.txt";
    @Test
    public void returnsTrueIfLevelIsLevelOneObject() throws IOException {
        Datasource datasource = new TextDataSource(RESOURCE_PATH);
        LevelFactory levelFactory =  new LevelFactory(datasource);

        Level level = levelFactory.generateLevel(0);
        assertThat(level, instanceOf(LevelOne.class));
    }

    @Test
    public void returnsTrueIfLevelIsLevelTwoObject() throws IOException {
        Datasource datasource = new TextDataSource(RESOURCE_PATH);
        LevelFactory levelFactory =  new LevelFactory(datasource);

        Level level = levelFactory.generateLevel(1);
        assertThat(level, instanceOf(LevelTwo.class));
    }

    @Test
    public void returnsTrueIfLevelIsLevelThreeObject() throws IOException {
        Datasource datasource = new TextDataSource(RESOURCE_PATH);
        LevelFactory levelFactory =  new LevelFactory(datasource);

        Level level = levelFactory.generateLevel(2);
        assertThat(level, instanceOf(LevelThree.class));
    }

    @Test
    public void returnsTrueIfLevelIsLevelFour() throws IOException {
        Datasource datasource = new TextDataSource(RESOURCE_PATH);
        LevelFactory levelFactory =  new LevelFactory(datasource);

        Level level = levelFactory.generateLevel(3);
        assertThat(level, instanceOf(LevelFour.class));
    }

    @Test
    public void returnsTrueIfLevelIsLevelFiveObject() throws IOException {
        Datasource datasource = new TextDataSource(RESOURCE_PATH);
        LevelFactory levelFactory =  new LevelFactory(datasource);

        Level level = levelFactory.generateLevel(4);
        assertThat(level, instanceOf(LevelFive.class));
    }
}
