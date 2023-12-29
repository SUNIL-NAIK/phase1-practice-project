package FourthSmallestElement2;

import java.util.Arrays;

public class FourthSmallestElement {

    public static int findFourthSmallest(int[] arr) {
        // Check if the array has at least four elements
        if (arr.length < 4) {
            System.out.println("Array should have at least four elements");
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the fourth smallest element
        return arr[3];
    }

    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {12, 8, 7, 3, 15, 10, 20};
        
        int fourthSmallest = findFourthSmallest(inputArray);

        if (fourthSmallest != -1) {
            System.out.println("Fourth smallest element is: " + fourthSmallest);
        }
    }
}
