package com;

public class QuickSortDemo {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // This function takes the last element as a pivot,
    // places the pivot element at its correct position in the sorted array,
    // and places all smaller (smaller than pivot) to the left and
    // all greater elements to the right.
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (or the pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // The main function that implements QuickSort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, array[pi] is now at the right place
            int pi = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Utility function to print an array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
