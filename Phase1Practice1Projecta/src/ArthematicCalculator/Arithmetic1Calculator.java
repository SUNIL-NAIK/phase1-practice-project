package ArthematicCalculator;

import java.util.Scanner;

public class Arithmetic1Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Welcome to the Enhanced Arithmetic Calculator!");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Use Previous Result");
            System.out.println("6. Clear Memory");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double num2;
            if (choice != 5) {
                System.out.print("Enter the number: ");
                num2 = scanner.nextDouble();
            } else {
                num2 = result; // Use previous result
            }

            switch (choice) {
                case 1:
                    result = add(result, num2);
                    break;
                case 2:
                    result = subtract(result, num2);
                    break;
                case 3:
                    result = multiply(result, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = divide(result, num2);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                case 6:
                    result = 0; // Clear memory
                    System.out.println("Memory cleared.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}

