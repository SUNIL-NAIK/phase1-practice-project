package DoublyLinkedListTraversal7;
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void traverseForward() {
        System.out.println("Forward traversal:");

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void traverseBackward() {
        System.out.println("Backward traversal:");

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }

        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        // Inserting elements into the doubly linked list
        doublyList.insertAtEnd(1);
        doublyList.insertAtEnd(2);
        doublyList.insertAtEnd(3);
        doublyList.insertAtEnd(4);

        // Forward traversal
        doublyList.traverseForward();

        // Backward traversal
        doublyList.traverseBackward();
    }
}

