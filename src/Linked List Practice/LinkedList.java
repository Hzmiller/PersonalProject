import java.util.Objects;

/**
 * From scratch implementation of a linked list.
 * @param <E> Generic type
 */
public class LinkedList<E> {

    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }

    private Node<E> head, tail;

    /** Create a default list */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /** Create a list from an array of objects
     * @param objects // objects which are used to create the array */
    public LinkedList(E[] objects) {}

    int size = 0;

    public void insertAtTail(E element) {
        Node<E> newNode = new Node<>(element);

        if(tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void insertAtHead(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;

        if(tail == null){
            tail = head;
        }


    }

    public void insertAtIndex(int index, E element) {
        Node<E> newNode = new Node<>(element);
        if(index == 0) {
            insertAtHead(element);
        } else if (index >= size) {
            insertAtTail(element);
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node<E> temp = currentNode.next;
            currentNode.next = new Node<>(element);
            (currentNode.next).next = temp;
            size++;
        }

    }

    public void deleteHead() {
        if(head == null) {
            return;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            temp = null;
            size--;
        }
    }

    public void deleteTail() {
        if(size == 0) {
            return;
        }else if(size == 1) {
            deleteHead();
        }
        else {
            Node<E> currentNode = head;
            for (int i = 0; i < size - 2; i++) {
                currentNode = currentNode.next;
            }
            Node<E> tailNode = tail;
            tail = currentNode;
            tail.next = null;
            size--;
        }
    }

    public void clearLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        } else if (index == 0){
            deleteHead();
        } else if (index == size - 1){
            deleteTail();
        } else {
            Node<E> previousNode = head;
            for (int i = 1; i < index; i++) {
                previousNode = previousNode.next;
            }
            Node<E> currentNode = previousNode.next;
            previousNode.next = currentNode.next;
            size--;
        }
    }

    public E getElementAtIndex(int index) {
        Node<E> current = head;
        if(index >= size || index < 0) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E replaceElementAtIndex(int index, E newElement) {
        if (size == 0) {
            head = new Node<>(newElement);
        }
        else if (index < 0 || index >= size) {
            return null;
        }
        else {
            Node<E> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.element = newElement;
        }
        return newElement;
    }

    public int getFirstIndexOfElement(E elementToFind) {
        int index = 0;
        if(head == null) {
            return -1;
        }
        else {
            Node<E> currentNode = head;
            for (int i = 0; i < size; i++) {
                if(currentNode.element == elementToFind) {
                    return index;
                } else {
                    currentNode = currentNode.next;
                    index++;
                    }
                }
            }
        return -1;
    }

    public int getLastIndexOfElement(E elementToFind) {
        int currentIndex = 0;
        int lastIndex = -1;
        if(head == null) {
            return -1;
        }
        else {
            Node<E> currentNode = head;
            for (int i = 0; i < size; i++) {
                if(currentNode.element == elementToFind) {
                     lastIndex = currentIndex;
                }
                currentNode = currentNode.next;
                currentIndex++;
                }
            }
        return lastIndex;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        if(current != null) {
            for (int i = 0; i < size; i++) {
                result.append(Objects.requireNonNull(current).element);
                current = current.next;
                if (current != null) {
                    result.append(", ");
                } else {
                    result.append("]");
                }
            }
        }
        else {
            result.append("]");
        }
        return result.toString();
    }
}
