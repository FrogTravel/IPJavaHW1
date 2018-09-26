package view;

import model.Operation;

import java.io.IOException;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TokenHandler {

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
