package SeventhLesson;



//Main test class
public class InnerClassTest {
 public static void main(String[] args) {
     // Creating an instance of the outer class
     Outer outerObject = new Outer();

     // Calling methods that use inner classes
     outerObject.anotherMethod();
     outerObject.testInnerClasses();
 }
}
