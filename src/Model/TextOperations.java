package Model;

import java.util.HashSet;
import java.util.Set;

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
    public boolean isAllWordsUnique(){
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
     */
    private boolean isEqualWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words)
            if (!uniqueWords.add(word.toLowerCase())) return false;
        return true;
    }

    /**
     * Метод считает сумму всем четных чисел
     * @return
     */
    public float countSum(){
        String[] tokens = tokenize();
        float sum = 0;
        float num;
        for (int i = 0; i < tokens.length; i++) {
            if((num = Float.valueOf(tokens[i])) % 2 == 0){
                sum += num;
                System.out.println(sum);
            }
        }
        return sum;
    }
}
