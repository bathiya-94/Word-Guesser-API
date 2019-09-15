package com.wordguesser.api.controller;
import com.wordguesser.api.model.word.Word;
import com.wordguesser.api.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.util.List;

@Controller
public class LevelController {
    @Autowired
    private LevelService levelService;

    @GetMapping(value = "/getWordsList", produces = "application/json")
    @ResponseBody
    public List<Word> getWordsList() throws IOException {
      return levelService.getWordList();
    }
}
