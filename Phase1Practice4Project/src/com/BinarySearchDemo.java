package com;
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sorted array elements
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();
        int[] sortedArray = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(sortedArray, target);

        // Display the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the sorted array.");
        }

        scanner.close();
    }

    // Binary search algorithm
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index if the element is found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Return -1 if the element is not found
    }
}
