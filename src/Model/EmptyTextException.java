package Model;

public class EmptyTextException extends Exception {
    public EmptyTextException(){
        super("Text is empty");
    }
}
