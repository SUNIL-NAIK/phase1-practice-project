package fourthLesson;

public class fourthMain 
 {

    private int value;

    // Default Constructor
    public fourthMain () {
        System.out.println("Default Constructor called");
        this.value = 0;
    }

    // Parameterized Constructor
    public fourthMain (int value) {
        System.out.println("Parameterized Constructor called");
        this.value = value;
    }

    // Copy Constructor
    public fourthMain (fourthMain  other) {
        System.out.println("Copy Constructor called");
        this.value = other.value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Verify Default Constructor
    	fourthMain  defaultConstructorObj = new fourthMain ();
        defaultConstructorObj.display();

        // Verify Parameterized Constructor
        fourthMain  parameterizedConstructorObj = new fourthMain (42);
        parameterizedConstructorObj.display();

        // Verify Copy Constructor
        fourthMain  originalObj = new fourthMain (99);
        fourthMain  copyConstructorObj = new fourthMain (originalObj);
        copyConstructorObj.display();
    }
   

}



