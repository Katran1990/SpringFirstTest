package com.spring.test;

/**
 * Created by Boris on 18.05.2016.
 */
public class PhraseImpl implements Phrase {
    private String phrase;

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void sayPhrase() {
        System.out.println("phrase = " + phrase);
    }
}
