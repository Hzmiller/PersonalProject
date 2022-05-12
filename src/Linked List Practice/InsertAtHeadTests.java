import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertAtHeadTests {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    void linkedListInsertTest() {
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);

        assertEquals("[3, 2, 1]", linkedList.toString());
    }
    @Test
    @DisplayName("Test 2")
    void linkedListInsertTest2() {
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(1);


        assertEquals("[1, 2, 3, 2, 1]", linkedList.toString());
    }
}
