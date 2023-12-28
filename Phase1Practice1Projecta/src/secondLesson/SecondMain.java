package secondLesson;

public class SecondMain 

//File: MyClass.java

//Public class, can be accessed from any other class
 {

 // Public field, accessible from any other class
 public int publicField = 10;

 // Protected field, accessible within the same package and subclasses
 protected int protectedField = 20;

 // Default (package-private) field, accessible within the same package
 int defaultField = 30;

 // Private field, accessible only within the same class
 private int privateField = 40;

 // Public constructor, can be called from any other class
 public SecondMain () {
     // Constructor code
 }

 // Public method, can be called from any other class
 public void publicMethod() {
     System.out.println("Public method called");
 }

 // Protected method, accessible within the same package and subclasses
 protected void protectedMethod() {
     System.out.println("Protected method called");
 }

 // Default (package-private) method, accessible within the same package
 void defaultMethod() {
     System.out.println("Default method called");
 }

 // Private method, accessible only within the same class
 private void privateMethod() {
     System.out.println("Private method called");
 }

 // Main method to demonstrate access modifiers
 public static void main(String[] args) {
	 SecondMain  myClass = new SecondMain ();

     // Accessing fields
     System.out.println("Public Field: " + myClass.publicField);
     System.out.println("Protected Field: " + myClass.protectedField);
     System.out.println("Default Field: " + myClass.defaultField);
     System.out.println("Private Field: " + myClass.privateField);  // This will cause a compilation error

     // Accessing methods
     myClass.publicMethod();
     myClass.protectedMethod();
     myClass.defaultMethod();
     myClass.privateMethod();  // This will cause a compilation error
 }
}

