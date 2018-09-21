import Model.EmptyTextException;
import Model.Reader;
import Model.TextOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader();
        String urlPath = reader.readUrlFromConsole();

        TextOperations textOperations = new TextOperations(reader.readTextFromURL(urlPath));
        try {
            System.out.println(textOperations.isAllWordsUnique());
        } catch (EmptyTextException e) {
            e.printStackTrace();
            System.out.println("Exception empty text");
        }
    }

    public static void getURLPath(){

    }
}
