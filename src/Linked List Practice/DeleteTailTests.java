import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DeleteTailTests {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void deleteTailTest1() {
        linkedList.insertAtIndex(0, 1);
        linkedList.deleteTail();

        assertEquals("[]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 2")
    void deleteTailTest2() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteTail();

        assertEquals("[1, 2, 3, 4]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 3")
    void deleteTailTest3() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteTail();
        linkedList.deleteTail();

        assertEquals("[1, 2, 3]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 4")
    void deleteTailTest4() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        linkedList.deleteTail();
        linkedList.deleteTail();
        linkedList.deleteTail();
        linkedList.deleteTail();
        linkedList.deleteTail();
        assertEquals("[]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 5")
    void deleteTailTest5() {
        linkedList.deleteTail();

        assertEquals("[]", linkedList.toString());
    }
}
