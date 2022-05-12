import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertNodeTests {
    private BinarySearchTree<Integer> tree;

    @BeforeEach
    public void BeforeEach() {
        tree = new BinarySearchTree<Integer>();
    }

    @AfterEach
    public void AfterEach() {
        tree = null;
    }

    @Test
    @DisplayName("Test 1")
    void insertNodeTest1() {
        Integer[] array = {8, 3, 5, 7, 9, 10, 2, 3};
        for (int i = 0; i <= array.length - 1; i++) {
            tree.insertNode(array[i]);
        }
        assertAll("Insert Test1",
                () -> assertTrue(tree.insertNode(22)),
                () -> assertEquals(8, tree.getSize())
        );
    }
    @Test
    @DisplayName("Test 2")
    void insertNodeTest2() {
        assertEquals(0, tree.getSize());
    }
    @Test
    @DisplayName("Test 3")
    void insertNodeTest3() {
        tree.insertNode(1);
        assertEquals(1, tree.getSize());
    }
}
