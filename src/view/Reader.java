package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Reader {
    /**
     * Достает BR для нашего аргумента. Возвращает null если не удалось открыть поток для чтения
     * @param argURL файл с которым нужно работать
     * @return bufferReader для нашего URL аргумента
     * @throws IOException ну не всегда фалы удачны, но обрабатывать здесь не вижу особого смысла
     */
    public BufferedReader getBufferedReader(String argURL) throws IOException {
        argURL = fixURL(argURL);

        URL url = null;
        try {
            url = new URL(argURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            return new BufferedReader(new InputStreamReader(url.openStream()));
        }else return null;

    }

    /**
     * Если это локальный файл, то он прийдет в неправильном формате. Нужно добавить file:// что бы в итоге получилось
     * file:///blabla.txt
     * Если файл начинается с / значит это файл на локальной машине
     * @param url Оригинальный путь к файлу
     * @return добавленный префикс
     */
    private String fixURL(String url) {
        return url.startsWith("/") ? "file://" + url : url;
    }

}
