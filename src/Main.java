import Model.Reader;
import Model.TextOperations;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();

        Presenter presenter = new Presenter();
        System.out.println("Введите URL:");


        String urlPath = reader.readUrlFromConsole();

        TextOperations textOperations;
        try {
            textOperations = new TextOperations(reader.readTextFromURL(urlPath));
            presenter.printResultOfUniqueness(textOperations);

        } catch (IOException e) {
            System.out.println("Неправильная URL!!");
        }

    }

}
