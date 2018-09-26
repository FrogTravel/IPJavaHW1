package model;

import java.util.HashSet;
import java.util.Set;

public class TextOperation implements Operation {
    private Set<String> uniqueWords = new HashSet<>();
    @Override
    public boolean process(String s) {
        boolean isSuccesfullAdd = uniqueWords.add(s);
        if(!isSuccesfullAdd)
            System.out.println("Слова не уникальны! Повторение в слове " + s);
        return isSuccesfullAdd;
    }

}
