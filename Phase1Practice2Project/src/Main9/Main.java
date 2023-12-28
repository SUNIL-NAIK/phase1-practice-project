package Main9;

//Define a class representing a basic shape
class Shape {
 // Encapsulation: Private fields are accessible only within the class
 private String color;

 // Constructor to initialize the color of the shape
 public Shape(String color) {
     this.color = color;
 }

 // Abstraction: Display information about the shape
 public void displayInfo() {
     System.out.println("This is a " + color + " shape.");
 }
}

//Inheritance: Create a subclass (Circle) inheriting from the Shape class
class Circle extends Shape {
 private double radius;

 // Constructor to initialize the color and radius of the circle
 public Circle(String color, double radius) {
     // Call the superclass constructor using 'super'
     super(color);
     this.radius = radius;
 }

 // Polymorphism: Override the displayInfo method to provide specific behavior for circles
 @Override
 public void displayInfo() {
     System.out.println("This is a " + getColor() + " circle with radius " + radius + ".");
 }

 private String getColor() {
	// TODO Auto-generated method stub
	return null;
}

// Additional method specific to circles
 public double calculateArea() {
     return Math.PI * Math.pow(radius, 2);
 }
}

//Another subclass (Rectangle) inheriting from the Shape class
class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor to initialize the color, length, and width of the rectangle
 public Rectangle(String color, double length, double width) {
     // Call the superclass constructor using 'super'
     super(color);
     this.length = length;
     this.width = width;
 }

 // Polymorphism: Override the displayInfo method to provide specific behavior for rectangles
 @Override
 public void displayInfo() {
     System.out.println("This is a " + getColor() + " rectangle with length " + length + " and width " + width + ".");
 }

 private String getColor() {
	// TODO Auto-generated method stub
	return null;
}

// Additional method specific to rectangles
 public double calculateArea() {
     return length * width;
 }
}

//Main class to demonstrate the program
public class Main {
 public static void main(String[] args) {
     // Create objects of the Circle and Rectangle classes
     Circle myCircle = new Circle("Red", 5.0);
     Rectangle myRectangle = new Rectangle("Blue", 4.0, 6.0);

     // Demonstrate polymorphism: Call displayInfo on both objects
     myCircle.displayInfo();
     myRectangle.displayInfo();

     // Demonstrate additional methods specific to subclasses
     System.out.println("Area of the circle: " + myCircle.calculateArea());
     System.out.println("Area of the rectangle: " + myRectangle.calculateArea());
 }
}
