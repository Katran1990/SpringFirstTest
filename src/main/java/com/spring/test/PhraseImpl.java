package com.spring.test;

/**
 * Created by Boris on 18.05.2016.
 */
public class PhraseImpl implements Phrase {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String phrase;

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void sayPhrase() {
        for (int i = 0; i <repeat; i++) {
            System.out.println("phrase = " + phrase);
        }
    }
}
