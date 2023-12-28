package FileCRUD7;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileCRUDProgram  {

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Create a file
        createFile(fileName);

        // Read from the file
        readFile(fileName);

        // Update the file
        updateFile(fileName, "This is the updated content.");

        // Read again after updating
        readFile(fileName);

        // Delete the file
        deleteFile(fileName);
    }

    private static void createFile(String fileName) {
        try {
            Path filePath = Paths.get(fileName);

            // Check if the file already exists
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("File created: " + filePath.toAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("File content:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateFile(String fileName, String newContent) {
        try {
            Files.write(Paths.get(fileName), newContent.getBytes());
            System.out.println("File updated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
            System.out.println("File deleted: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

