package com.example.mimsoft.appspokenenglish.models;

/**
 * Created by Amir Raza on 11/5/2016.
 */
public class WordDetail {
    static int i = 0;

    public String word;
    public String meaning;
    public WordDetail() {
        word = "word " + i;
        meaning = "meaning of word "+ i++ ;
    }
}
