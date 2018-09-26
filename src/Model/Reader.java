package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Reader {
    public String readFile(String url) throws IOException {
        if (url.startsWith("/")) {
            url = "file://" + url;
        }
        return readTextFromURL(url);
    }

    /**
     * @param urlPath откуда скачать
     * @return текст с предоставленной ссылки
     * @throws IOException ошибка возникает при неправильной ссылке
     */
    private String readTextFromURL(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder text = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            text.append(line + " ");
        }
        reader.close();


        return text.toString();
    }

}
