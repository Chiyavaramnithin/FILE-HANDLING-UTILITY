import java.io.*;
import java.nio.file.*;

public class Main {

    
    public static void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }
    }

    
    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }

    
    public static void modifyFile(String filename, String newText) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.newLine(); 
            writer.write(newText);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        String filename = "example.txt";
        String initialContent = "This is the original content of the file.";
        String appendText = "This line is newly appended.";

        
        writeFile(filename, initialContent);

        
        readFile(filename);

        
        modifyFile(filename, appendText);

    
        readFile(filename);
    }
}
