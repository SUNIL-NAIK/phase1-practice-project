package PracticeProgram;

public class IXCasting {
	public static void main(String[] args) {
        // Implicit casting (widening)
        int intValue = 10;
        double doubleValue = (double) intValue; // int to double

        System.out.println("Implicit Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println();

        // Explicit casting (narrowing)
        double doubleNumber = 15.75;
        int intNumber = (int) doubleNumber; // double to int

        System.out.println("Explicit Casting (Narrowing):");
        System.out.println("double number: " + doubleNumber);
        System.out.println("int number: " + intNumber);
    }
}

