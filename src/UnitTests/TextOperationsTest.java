package UnitTests;

import Model.EmptyTextException;
import Model.TextOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextOperationsTest {
    private String uniqueTestText = "This is test text";
    private String notUniqueTestText = "This is test text text";


    @Test
    public void uniqueTextTest() throws EmptyTextException {
        TextOperations textOperations = new TextOperations(uniqueTestText);
        assertTrue(textOperations.isAllWordsUnique());
    }

    @Test
    public void notUniqueTextTest() throws EmptyTextException {
        TextOperations textOperations = new TextOperations(notUniqueTestText);
        assertFalse(textOperations.isAllWordsUnique());
    }
}