package ProjectFileHandling;
import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class  FileHandling{

	    public static void main(String[] args) {
	        // Specify the input and output file paths
	        String inputFile = "input.txt";
	        String outputFile = "output.txt";

	        try {
	            // Read data from the input file
	            //String inputData ="C:\Users\User\Desktop\New folder\New folder\input.txt";
	        	String inputData = "C:\\Users\\User\\Desktop\\New folder\\New folder\\input.txt";

	            // Write data to the output file
	            writeFile(outputFile, inputData);

	            System.out.println("File handling completed successfully.");

	        } catch (IOException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	    }

	    // Method to read data from a file
	    private static String readFile(String filePath) throws IOException {
	        StringBuilder content = new StringBuilder();

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        }

	        return content.toString();
	    }

	    // Method to write data to a file
	    private static void writeFile(String filePath, String data) throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            writer.write(data);
	        }
	    }
	}

