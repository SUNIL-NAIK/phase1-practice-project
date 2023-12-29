package RightRotateArray1;

public class RightRotateArray {

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Number of steps to rotate
        int steps = 5;

        System.out.println("Original Array:");
        printArray(array);

        // Right rotate the array by 5 steps
        rightRotateArray(array, steps);

        System.out.println("\nArray after right rotation by " + steps + " steps:");
        printArray(array);
    }

    // Function to right rotate an array by 'steps' steps
    private static void rightRotateArray(int[] arr, int steps) {
        int length = arr.length;

        // Normalize the steps to avoid unnecessary rotations
        steps = steps % length;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[steps];

        // Store the last 'steps' elements in the temporary array
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[length - steps + i];
        }

        // Shift the remaining elements to the right
        for (int i = length - steps - 1; i >= 0; i--) {
            arr[i + steps] = arr[i];
        }

        // Copy the elements from the temporary array to the beginning of the array
        System.arraycopy(temp, 0, arr, 0, steps);
    }

    // Function to print an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

