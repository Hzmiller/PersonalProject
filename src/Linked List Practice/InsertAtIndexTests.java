import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertAtIndexTests {
    private LinkedList<String> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void insertAtIndexTest1() {
        linkedList.insertAtIndex(0, "Apple");

        assertEquals("[Apple]", linkedList.toString());
    }

    @Test
    @DisplayName("Test 2")
    void insertAtIndexTest2() {
        linkedList.insertAtIndex(0, "Apple");
        linkedList.insertAtIndex(1, "Pear");

        assertEquals("[Apple, Pear]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 3")
    void insertAtIndexTest3() {
        linkedList.insertAtIndex(0, "Apple");
        linkedList.insertAtIndex(1, "Pear");
        linkedList.insertAtIndex(99, "Orange");


        assertEquals("[Apple, Pear, Orange]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 4")
    void insertAtIndexTest4() {
        linkedList.insertAtIndex(0, "Apple");
        linkedList.insertAtIndex(1, "Pear");
        linkedList.insertAtIndex(99, "Orange");
        linkedList.insertAtIndex(0, "Mango");


        assertEquals("[Mango, Apple, Pear, Orange]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 5")
    void insertAtIndexTest5() {
        linkedList.insertAtIndex(0, "Apple");
        linkedList.insertAtIndex(1, "Pear");
        linkedList.insertAtIndex(99, "Orange");
        linkedList.insertAtIndex(0, "Mango");
        linkedList.insertAtIndex(2, "Pineapple");


        assertEquals("[Mango, Apple, Pineapple, Pear, Orange]", linkedList.toString());
    }
}
