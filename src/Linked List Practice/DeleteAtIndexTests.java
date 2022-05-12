import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteAtIndexTests {
    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void deleteAtIndexTest1() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(0);

        assertEquals("[2, 3, 4, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 2")
    void deleteAtIndexTest2() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(4);

        assertEquals("[1, 2, 3, 4]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 3")
    void deleteAtIndexTest3() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(2);

        assertEquals("[1, 2, 4, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 4")
    void deleteAtIndexTest4() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(2);
        linkedList.deleteAtIndex(2);

        assertEquals("[1, 2, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 5")
    void deleteAtIndexTest5() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(99);

        assertEquals("[1, 2, 3, 4, 5]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 6")
    void deleteAtIndexTest6() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteAtIndex(-99);

        assertEquals("[1, 2, 3, 4, 5]", linkedList.toString());
    }
}
