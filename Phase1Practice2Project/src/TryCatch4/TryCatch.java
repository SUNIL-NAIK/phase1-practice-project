package TryCatch4;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = divideNumbers(numerator, denominator);

            // Displaying the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling the ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Catching and handling other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner in the finally block to ensure it is always closed
            scanner.close();
        }
    }

    // Method to perform division and throw ArithmeticException if the denominator is zero
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
