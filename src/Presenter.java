import Model.TextOperations;

public class Presenter {
    public void printResultOfUniqueness(TextOperations textOperations){
        if(textOperations.isAllWordsUnique()){
            System.out.println("Все слова уникальны!");
        }else{
            System.out.println("Есть повторяющиеся слова!");
        }
    }
}
