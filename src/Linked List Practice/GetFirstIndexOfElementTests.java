import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFirstIndexOfElementTests {
    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {
        linkedList = new LinkedList<>();
    }

    @AfterEach
    public void AfterEach() {
        linkedList = null;
    }

    @Test
    @DisplayName("Test 1")
    void getFirstIndexOfElementTest1() {
        linkedList.insertAtTail(1);
        linkedList.insertAtTail(2);
        linkedList.insertAtTail(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);

        assertEquals(0, linkedList.getFirstIndexOfElement(1));
    }
    @Test
    @DisplayName("Test 2")
    void getFirstIndexOfElementTest2() {
        linkedList.insertAtTail(1);
        linkedList.insertAtTail(2);
        linkedList.insertAtTail(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);

        assertEquals(4, linkedList.getFirstIndexOfElement(5));
    }
    @Test
    @DisplayName("Test 3")
    void getFirstIndexOfElementTest3() {
        linkedList.insertAtTail(1);
        linkedList.insertAtTail(2);
        linkedList.insertAtTail(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);

        assertEquals(-1, linkedList.getFirstIndexOfElement(6));
    }
}
