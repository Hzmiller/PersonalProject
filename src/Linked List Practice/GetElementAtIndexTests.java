import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetElementAtIndexTests {
    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void BeforeEach() {linkedList = new LinkedList<>();}
    @AfterEach
    public void AfterEach() {linkedList = null;}

    @Test
    @DisplayName("Test 1")
    public void getElementAtIndexTest1() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        assertEquals(5, linkedList.getElementAtIndex(4));
    }
    @Test
    @DisplayName("Test 2")
    public void getElementAtIndexTest2() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        assertEquals(null, linkedList.getElementAtIndex(99));
    }
    @Test
    @DisplayName("Test 3")
    public void getElementAtIndexTest3() {
        linkedList.insertAtIndex(0, 1);
        linkedList.insertAtIndex(1, 2);
        linkedList.insertAtIndex(2, 3);
        linkedList.insertAtIndex(3, 4);
        linkedList.insertAtIndex(4, 5);

        assertEquals(null, linkedList.getElementAtIndex(-99));
    }

}
