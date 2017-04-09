package com.example.mimsoft.appspokenenglish.models;

import java.util.ArrayList;
import java.util.List;

public class WordGroup {
    static int i = 0;

    public String title;
    public List<WordDetail> wordDetails;

    public WordGroup() {
        title = "word group " + i++;
        wordDetails = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            wordDetails.add(new WordDetail());
        }
    }
}
