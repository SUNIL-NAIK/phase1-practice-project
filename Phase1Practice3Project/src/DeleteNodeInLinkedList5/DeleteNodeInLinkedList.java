package DeleteNodeInLinkedList5;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;

        // If the key is in the head node
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key to be deleted
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not present in the list
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Adding nodes to the linked list
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        System.out.println("Original Linked List:");
        linkedList.printList();

        // Deleting the first occurrence of key=2
        linkedList.deleteNode(2);

        System.out.println("Linked List after deleting key=2:");
        linkedList.printList();
    }
}
