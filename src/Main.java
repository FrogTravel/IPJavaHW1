import Model.Reader;
import Model.TextOperations;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();

        Presenter presenter = new Presenter();


        TextOperations textOperations;
        try {
            for (int i = 1; i < args.length; i++) {
                if (args[0].equals("1")) {
                    presenter.printResultOfUniqueness(reader.readFile(args[i]));
                } else if (args[0].equals("2")) {
                    presenter.printResultOfSum(reader.readFile(args[i]));
                } else {
                }
            }
        } catch (IOException e) {
        }

    }
}