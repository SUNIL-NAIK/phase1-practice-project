package NinethLesson;
public class ArrayVerification {

    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = new int[5];

        // Populating the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Accessing and printing elements
        System.out.println("Array elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // Updating an element
        int indexToUpdate = 2;
        int newValue = 100;
        myArray[indexToUpdate] = newValue;
        System.out.println("\nArray after updating element at index " + indexToUpdate + ":");
        printArray(myArray);

        // Verifying array length
        System.out.println("\nArray length: " + myArray.length);

        // Iterating through the array using enhanced for loop
        System.out.println("\nIterating through the array using enhanced for loop:");
        for (int element : myArray) {
            System.out.println("Element: " + element);
        }
    }

    // Utility method to print the array
    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
