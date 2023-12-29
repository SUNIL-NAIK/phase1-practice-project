package SeventhLesson;

//OuterTest.java

import org.junit.Test;
import static org.junit.Assert.*;

public class OuterTest {

 @Test
 public void testNonStaticInnerClass() {
     Outer outerObject = new Outer();
     Outer.Inner innerObject = outerObject.new Inner();

     assertNotNull(innerObject);
     innerObject.display();
 }

 @Test
 public void testStaticInnerClass() {
     Outer.StaticInner staticInnerObject = new Outer.StaticInner();

     assertNotNull(staticInnerObject);
     staticInnerObject.display();
 }

 @Test
 public void testAnotherMethod() {
     Outer outerObject = new Outer();
     outerObject.anotherMethod();
     // If the test reaches this point without exceptions, it is considered a success.
 }

 @Test
 public void testTestInnerClasses() {
     Outer outerObject = new Outer();
     outerObject.testInnerClasses();
     // If the test reaches this point without exceptions, it is considered a success.
 }
}
