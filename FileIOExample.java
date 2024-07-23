import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileIOExample {

    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Computer Science and Engineering";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from file
        try (FileReader reader = new FileReader(filename)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}