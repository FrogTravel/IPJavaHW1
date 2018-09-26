package util;

import model.Operation;

import java.io.IOException;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TokenHandler {

    /**
     * Магия Java 8. Через BufferReader открываем поток на чтение по-очереди каждой строки. Через flatMap разделяем
     * токены и создаем новый поток. Автоматически закроется так как через try.
     * boolean параметр используется для вывода результата вычислений, а так же разделитель, я же все-таки девочка ^^
     * @param urlstr адрес файла/ресурса
     * @param operation что делать с файлом
     */
    public void forEachToken(String urlstr, Operation operation){
        Reader reader = new Reader();

        try (Stream<String> lines = reader.getBufferedReader(urlstr).lines().flatMap(Pattern.compile(" ")::splitAsStream)) {
            boolean successful = lines.anyMatch(s -> !operation.process(s));
            if (!successful) {
                System.out.println("Успешно завершено!");
            }
            System.out.println("----------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
