import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class InsertAtTailTests {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void linkedListInsertTest() {
        linkedList.insertAtTail( 1);
        linkedList.insertAtTail( 2);
        linkedList.insertAtTail( 3);

        assertEquals("[1, 2, 3]", linkedList.toString());

    }
    @Test
    @DisplayName("Test 2")
    void linkedListInsertTest2() {
        linkedList.insertAtTail( 1);
        linkedList.insertAtTail( 2);
        linkedList.insertAtTail( 3);
        linkedList.insertAtTail( 2);
        linkedList.insertAtTail( 1);

        assertEquals("[1, 2, 3, 2, 1]", linkedList.toString());

    }
    @Test
    @DisplayName("Test 3")
    void linkedListInsertTest3() {
        assertEquals("[]", linkedList.toString());

    }
}
