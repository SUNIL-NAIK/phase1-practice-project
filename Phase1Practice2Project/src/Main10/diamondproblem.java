package Main10;

// Common interface
interface Animal {
    void makeSound();
}

// First interface representing a Dog
interface Dog extends Animal {
    @Override
    default void makeSound() {
        System.out.println("Woof!");
    }
}

// Second interface representing a Cat
interface Cat extends Animal {
    @Override
    default void makeSound() {
        System.out.println("Meow!");
    }
}

// Combined interface extending Dog and Cat interfaces
interface DogCatHybridInterface extends Dog, Cat {
    // Resolve the conflict by providing a method in the combined interface
    @Override
    default void makeSound() {
        Dog.super.makeSound(); // Choose Dog's implementation
    }
}

// Class implementing the combined interface
class DogCatHybrid implements DogCatHybridInterface {
    // No need to override makeSound in the DogCatHybrid class
}

public class diamondproblem {
    public static void main(String[] args) {
        DogCatHybrid hybrid = new DogCatHybrid();
        hybrid.makeSound(); // Outputs: Woof!
    }
}
