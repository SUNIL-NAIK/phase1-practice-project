package Stack8;


	import java.util.Stack;

	public class Stackp {
	    public static void main(String[] args) {
	        // Creating a stack
	        Stack<String> stack = new Stack<>();

	        // Inserting elements into the stack
	        stack.push("Element 1");
	        stack.push("Element 2");
	        stack.push("Element 3");

	        System.out.println("Stack after insertion: " + stack);

	        // Removing elements from the stack
	        String removedElement = stack.pop();
	        System.out.println("Removed element: " + removedElement);
	        System.out.println("Stack after removal: " + stack);

	        // Peek at the top element without removing it
	        String topElement = stack.peek();
	        System.out.println("Top element: " + topElement);

	        // Check if the stack is empty
	        boolean isEmpty = stack.isEmpty();
	        System.out.println("Is the stack empty? " + isEmpty);
	    }
	}
