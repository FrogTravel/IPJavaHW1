package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс обработки текстовых операций.
 */
public class TextOperation implements Operation {
    private Set<String> uniqueWords = new HashSet<>();

    /**
     * Обработчик операций с текстом
     * @param s новый токен под обработку
     * @return true - если не нужно завершать, false если нужно завершить и слова не уникальны
     */
    @Override
    public boolean process(String s) {
        boolean isSuccesfullAdd = checkUniqueness(s);
        if(!isSuccesfullAdd)
            System.out.println("Слова не уникальны! Повторение в слове " + s);
        return isSuccesfullAdd;
    }

    /**
     * Для разделения функциональности, все такое. Проверяется все через HashSet.
     * @param s то что нужно проверить на уникальность
     * @return true - если уникально
     */
    private boolean checkUniqueness(String s){
        return uniqueWords.add(s);
    }

}
