package Exception5;
  
//Custom exception class
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

public class ExceptionProgram {
 public static void main(String[] args) {
     try {
         // Example of throwing a built-in exception
         divide(10, 0);

         // Example of throwing a custom exception
         validateAge(15);

     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: " + e.getMessage());

     } catch (CustomException e) {
         System.out.println("Caught CustomException: " + e.getMessage());

     } finally {
         System.out.println("Finally block executed.");
     }
 }

 // Method that throws an exception using throws keyword
 public static void divide(int numerator, int denominator) throws ArithmeticException {
     if (denominator == 0) {
         throw new ArithmeticException("Cannot divide by zero");
     }

     int result = numerator / denominator;
     System.out.println("Result of division: " + result);
 }

 // Method that throws a custom exception
 public static void validateAge(int age) throws CustomException {
     if (age < 18) {
         throw new CustomException("Age must be 18 or older");
     } else {
         System.out.println("Valid age: " + age);
     }
 }
}

