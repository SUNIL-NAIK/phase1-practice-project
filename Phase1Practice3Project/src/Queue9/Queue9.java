package Queue9;



	import java.util.LinkedList;
	import java.util.Queue;

	public class Queue9 {
	    public static void main(String[] args) {
	        // Creating a queue using LinkedList
	        Queue<String> queue = new LinkedList<>();

	        // Inserting elements into the queue
	        enqueue(queue, "Element 1");
	        enqueue(queue, "Element 2");
	        enqueue(queue, "Element 3");

	        // Displaying the elements in the queue
	        displayQueue(queue);

	        // Removing elements from the queue
	        dequeue(queue);
	        dequeue(queue);

	        // Displaying the elements in the queue after removal
	        displayQueue(queue);
	    }

	    // Method to insert an element into the queue
	    private static void enqueue(Queue<String> queue, String element) {
	        queue.add(element);
	        System.out.println("Enqueued: " + element);
	    }

	    // Method to remove an element from the queue
	    private static void dequeue(Queue<String> queue) {
	        if (!queue.isEmpty()) {
	            String removedElement = queue.poll();
	            System.out.println("Dequeued: " + removedElement);
	        } else {
	            System.out.println("Queue is empty. Cannot dequeue.");
	        }
	    }

	    // Method to display the elements in the queue
	    private static void displayQueue(Queue<String> queue) {
	        System.out.println("Queue elements: " + queue);
	    }
	}

