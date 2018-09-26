import Model.Reader;
import Model.TextOperations;

public class Presenter {


    public void printResultOfUniqueness(String text) {
        TextOperations textOperations = new TextOperations(text);
        if (textOperations.isAllWordsUnique()) {
            System.out.println("Все слова уникальны!");
        } else {
            System.out.println("Есть повторяющиеся слова!");
        }
    }

    public void printResultOfSum(String text) {
        TextOperations textOperations = new TextOperations(text);
        System.out.println("Итоговая сумма: " + textOperations.countSum());
    }
}
