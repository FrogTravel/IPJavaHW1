package view;

import model.NumberOperation;
import model.TextOperation;
import util.TokenHandler;

public class Main {

    public static void main(String[] args) {
        TokenHandler tokenHandler = new TokenHandler();

        for (int i = 0; i < args.length; i++) {//Проходимся по всем аргументам

            if (args[i].length() == 1) {//Если это какой то флаг
                if (args[i].equals("2")) {//Второй вариант
                    tokenHandler.forEachToken(args[i + 1], new TextOperation());//Тогда выполняем второй вариант
                } else if (args[i].equals("3")) {//Третий вариант
                    tokenHandler.forEachToken(args[i + 1], new NumberOperation());//Тогда выполняем третий вариант
                } else {
                    System.out.println("Такого варианта не существует");
                }
                i++;//И мы должны пропустить следующий элемент
            } else//Ну а если это не флаг
                tokenHandler.forEachToken(args[i], new TextOperation());//Тогда выполняем второй вариант

        }


    }


}