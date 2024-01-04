package com;

public class ExponentialSearchDemo {
    public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) {
            return 0; // Target is found at index 0
        }

        int i = 1;
        int n = array.length;

        // Double the index while the current element is less than the target
        while (i < n && array[i] <= target) {
            i *= 2;
        }

        // Perform a binary search in the subarray [i/2, min(i, n-1)]
        return binarySearch(array, target, i / 2, Math.min(i, n - 1));
    }

    private static int binarySearch(int[] array, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; // Target is found
            } else if (array[mid] < target) {
                low = mid + 1; // Discard the left half
            } else {
                high = mid - 1; // Discard the right half
            }
        }

        return -1; // Target is not in the array
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;

        int result = exponentialSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

