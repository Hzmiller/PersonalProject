import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteHeadTests {
    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void deleteHeadTest1() {
        linkedList.insertAtIndex(0, 1);
        linkedList.deleteHead();

        assertEquals("[]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 2")
    void deleteHeadTest2() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);
        linkedList.deleteHead();

        assertEquals("[2, 3, 4, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 3")
    void deleteHeadTest3() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);
        linkedList.deleteHead();
        linkedList.deleteHead();

        assertEquals("[3, 4, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 4")
    void deleteHeadTest4() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);
        linkedList.deleteHead();
        linkedList.deleteHead();
        linkedList.deleteHead();
        linkedList.deleteHead();
        linkedList.deleteHead();

        assertEquals("[]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 5")
    void deleteHeadTest5() {

        linkedList.deleteHead();

        assertEquals("[]", linkedList.toString());
    }
}
