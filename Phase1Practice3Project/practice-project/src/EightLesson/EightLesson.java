package EightLesson;

public class EightLesson 
 {

    public static void main(String[] args) {
        // Create a string
        String originalString = "Hello, World!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.append("Sunil");
        stringBuffer.append("Naik");
       
        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);
       
        System.out.println("String buf "+ stringBuffer + ":");
        System.out.println("String buf "+ stringBuilder + ":");
        // Display the original string
        System.out.println("Original String: " + originalString);

        // Display the conversion to StringBuffer
        System.out.println("String to StringBuffer: " + stringBuffer.toString());

        // Display the conversion to StringBuilder
        System.out.println("String to StringBuilder: " + stringBuilder.toString());
    }
}

