import java.io.FileWriter;
import java.io.IOException;

class easy3 {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        String content = "Hello, this is a sample text written to the file.";
	try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Content successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}