package SeventhLesson;

public class Outer {
 private int outerField = 10;

 // Non-static inner class
 class Inner {
     void display() {
         System.out.println("Inner class display method. OuterField: " + outerField);
     }
 }

 // Static inner class
 static class StaticInner {
     void display() {
         System.out.println("Static inner class display method.");
     }
 }

 // Another method that uses the non-static inner class
 void anotherMethod() {
     System.out.println("Inside anotherMethod:");

     // Creating an instance of the non-static inner class
     Inner innerObject = new Inner();
     innerObject.display();
 }

 // Method to test inner classes
 void testInnerClasses() {
     System.out.println("Inside testInnerClasses:");

     // Creating an instance of the static inner class
     StaticInner staticInnerObject = new StaticInner();
     staticInnerObject.display();
 }
}
