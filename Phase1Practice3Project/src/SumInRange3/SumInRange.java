package SumInRange3;

import java.util.Scanner;

public class SumInRange {

    public static int findSumInRange(int[] arr, int L, int R) {
        // Check if the indices are valid
        if (L < 0 || R >= arr.length || L > R) {
            System.out.println("Invalid indices");
            return -1;
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Input range [L, R]
        System.out.print("Enter the value of L: ");
        int L = scanner.nextInt();
        System.out.print("Enter the value of R: ");
        int R = scanner.nextInt();

        // Find and display the sum in the specified range
        int sumInRange = findSumInRange(inputArray, L, R);

        if (sumInRange != -1) {
            System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sumInRange);
        }

        scanner.close();
    }
}
