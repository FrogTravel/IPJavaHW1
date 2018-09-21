package Model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class TextOperations {
    private String text;

    public TextOperations(String text) {
        this.text = text;
    }

    /**
     * Метод для проверки все ли слова уникальные
     *
     * @return true если все слова уникальные; false - если есть повторяющиеся слова
     */
    public boolean isAllWordsUnique() throws EmptyTextException {
        if(text.isEmpty()){
            throw new EmptyTextException();
        }
        String words[] = tokenize();
        return isEqualWords(words);
    }

    /**
     * Разделяем слово по токенам через пробел
     *
     * @return массив слов
     */
    private String[] tokenize() {
        return text.split(" ");
    }

    /**
     * Проверка слова на уникальность
     * Set как стр. д. не позволяет дважды добавлять одно и то же слово
     * Опускаем регистр, так как слово должно не добавляться в любом случае
     *
     * @param words слова которые нужно проверить
     * @return true - если было хоть одно такое же слово; false - если все слова уникальные
     * TODO может нужно переименовать
     */
    private boolean isEqualWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words)
            if (!uniqueWords.add(word.toLowerCase())) return false;
        return true;
    }
}
