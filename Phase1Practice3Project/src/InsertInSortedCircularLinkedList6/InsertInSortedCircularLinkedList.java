package InsertInSortedCircularLinkedList6;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLinkedList {
    Node head;

    public void insert(int newData) {
        Node newNode = new Node(newData);

        // If the list is empty, make the new node the head and point it to itself
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            Node prev = null;

            // Traverse the list to find the correct position to insert the new node
            do {
                prev = current;
                current = current.next;
            } while (current != head && current.data < newData);

            // Insert the new node
            prev.next = newNode;
            newNode.next = current;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;

        // Traverse the circular linked list and print each element
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class InsertInSortedCircularLinkedList {
    public static void main(String[] args) {
        SortedCircularLinkedList circularList = new SortedCircularLinkedList();

        // Inserting elements into the sorted circular linked list
        circularList.insert(3);
        circularList.insert(5);
        circularList.insert(8);
        circularList.insert(10);

        System.out.println("Original Sorted Circular Linked List:");
        circularList.display();

        // Inserting a new element (e.g., 6) into the sorted circular linked list
        circularList.insert(6);

        System.out.println("Sorted Circular Linked List after inserting 6:");
        circularList.display();
    }
}
