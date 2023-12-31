package ExceptionHandlingDemo6;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            // Performing division
            double result = divideNumbers(numerator, denominator);

            // Displaying the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handling arithmetic exception (e.g., division by zero)
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner in the finally block to ensure it gets closed
            scanner.close();
        }
    }

    // Method to perform division
    private static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            // Throwing an ArithmeticException for division by zero
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }
}
